package com.project.service;

import com.project.service.contract.GroupChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.UserException;
import com.project.service.persistence.ChatRepository;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    private final UserRepository userRepository;

    private final ChatRepository chatRepository;

    private  final HelperService helperService;

    @Override
    public ChatEntity createChat(UserEntity fromUser, UUID toUserId) throws UserException {

        UserEntity toUser = userRepository.findById(toUserId).orElse(null);
        if (toUser == null) {
            log.error("To User Doesn't exist");
            throw new UserException("To User Doesn't exist", ExceptionReason.USER_NOT_EXIST.name());
        }
        //If there is already a chat between the two users then return that chat details
        ChatEntity isChatExist = this.chatRepository.findSingleChatByUserIds(toUser, fromUser);
        log.info("The contents of toUser is : {}", isChatExist);
        System.out.println(isChatExist);
        if (isChatExist != null) {
            return isChatExist;
        }

        ChatEntity chat = new ChatEntity();
        chat.setCreatedBy(fromUser);
        chat.getUsers().add(toUser);
        chat.getUsers().add(fromUser);
        chat.setGroup(false);

        chat = this.chatRepository.save(chat);

        return chat;
    }

    @Override
    public void deleteChat(UUID chatId, UserEntity fromUser) throws ChatException {
        ChatEntity chat = this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The expected chat is not found while deleting", ExceptionReason.CHAT_NOT_FOUND.name()));
        this.chatRepository.delete(chat);
    }

    @Override
    public ChatEntity findChatById(UUID chatId) throws ChatException {
        return this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The requested chat is not found", ExceptionReason.CHAT_NOT_FOUND.name()));
    }

    @Override
    public ChatEntity createGroup(GroupChatRequestObject req, UserEntity fromUser) throws UserException {
        ChatEntity group = new ChatEntity();
        group.setGroup(true);
        group.setChatImage(req.getChatImage());
        group.setChatName(req.getChatName());
        group.setCreatedBy(fromUser);
        group.getAdmins().add(fromUser);

        for (UUID userId : req.getUserIds()) {
            UserEntity user = userRepository.findById(userId).orElseThrow(() -> new UserException("The requested user is not found", ExceptionReason.USER_NOT_EXIST.name()));
            group.getUsers().add(user);
        }

        group = chatRepository.save(group);
        return group;
    }

    @Override
    public List<ChatEntity> findAllChatByUserId(UUID userId) throws UserException {
        UserEntity user = helperService.findUserById(userId);
        return this.chatRepository.findChatByUserId(user.getId());
    }

    @Override
    public ChatEntity addUserToGroup(UUID userId, UUID chatId, UserEntity reqUser) throws UserException, ChatException {
        ChatEntity chat = this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The expected chat is not found", ExceptionReason.CHAT_NOT_FOUND.name()));

        UserEntity user = helperService.findUserById(userId);

        if (chat.getAdmins().contains((reqUser))) {
            chat.getUsers().add(user);
            chatRepository.save(chat);
            return chat;
        } else {
            throw new UserException("You have do not have access to add user", ExceptionReason.USER_NOT_ADMIN.name());
        }
    }

    @Override
    public ChatEntity removeFromGroup(UUID chatId, UUID userId, UserEntity reqUser) throws UserException, ChatException {
        ChatEntity chat = this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The expected chat is not found", ExceptionReason.CHAT_NOT_FOUND.name()));
        UserEntity user = helperService.findUserById(userId);
        if (chat.getAdmins().contains((reqUser))) {
            chat.getUsers().remove(user);
            return chat;
        } else if (chat.getUsers().contains(reqUser)) {
            if (user.getId() == reqUser.getId()) {
                chat.getUsers().remove(user);
                //Do we need this?
                return chatRepository.save(chat);
            }
        }
        throw new UserException("You have not access to remove user", ExceptionReason.USER_NOT_ADMIN.name());

    }
}
