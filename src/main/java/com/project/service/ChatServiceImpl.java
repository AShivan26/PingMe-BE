package com.project.service;

import com.project.service.contract.GroupChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.UserException;
import com.project.service.persistence.ChatRepository;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class ChatServiceImpl implements ChatService {

    @Autowired
    private UserRepository userRepository;

    @Autowired
    private ChatRepository chatRepository;

    @Override
    public ChatEntity createChat(UserEntity fromUser, UUID toUserId) throws UserException {

        UserEntity toUser = userRepository.findById(toUserId).orElse(null);
        if (toUser == null) {
            throw new UserException("To User Doesn't exist");
        }
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
    public void deleteChat(UUID chatId, UserEntity fromUser) throws ChatException, UserException {
        ChatEntity chat = this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The expected chat is not found while deleting"));
        this.chatRepository.delete(chat);
    }

    @Override
    public ChatEntity findChatById(UUID chatId) throws ChatException {
        return this.chatRepository.findById(chatId)
                .orElseThrow(() -> new ChatException("The requested chat is not found"));
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
            UserEntity user = userRepository.findById(userId).orElseThrow(() -> new UserException("The requested user is not found"));
            group.getUsers().add(user);
        }

        group = this.chatRepository.save(group);
        return group;
    }
}
