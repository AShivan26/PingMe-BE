package com.project.service;

import com.project.service.contract.SendMessageRequest;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.MessageEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.ExceptionReason;
import com.project.service.exception.MessageException;
import com.project.service.exception.UserException;
import com.project.service.persistence.MessageRepository;
import com.project.service.persistence.UserRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
public class MessageServiceImpl implements MessageService {

    private final MessageRepository messageRepository;

    private final UserRepository userRepository;

    private final ChatService chatService;

    private final SimpMessagingTemplate messagingTemplate;

    @Override
    public MessageEntity sendMessage(SendMessageRequest req) throws UserException, ChatException {
        UserEntity fromUser = userRepository.findById(req.getUserId()).orElse(null);
        if (fromUser == null) {
            throw new UserException("From User Doesn't exist", ExceptionReason.USER_NOT_EXIST.name());
        }
        ChatEntity chat = chatService.findChatById(req.getChatId());

        MessageEntity message = new MessageEntity();
        message.setChat(chat);
        message.setUser(fromUser);
        message.setContent(req.getContent());
        message.setTimestamp(LocalDateTime.now());

        message = this.messageRepository.save(message);

        // Send message to WebSocket topic based on chat type
        if (chat.isGroup()) {
            messagingTemplate.convertAndSend("/group/" + chat.getId(), message);
        } else {
            messagingTemplate.convertAndSendToUser(fromUser.getName(), "/queue/messages", message);
        }

        return message;
    }

    @Override
    public List<MessageEntity> getChatsMessages(UUID chatId, UserEntity fromUser) throws ChatException, UserException {
        ChatEntity chat = chatService.findChatById(chatId);

        if (!chat.getUsers().contains(fromUser)) {
            throw new UserException("You are not related to this chat",ExceptionReason.FORBIDDEN_ACCESS.name());
        }

        return this.messageRepository.findByChatId(chat.getId());

    }

    @Override
    public void deleteMessage(UUID messageId, UserEntity fromUser) throws MessageException, UserException {
        MessageEntity message = this.messageRepository.findById(messageId)
                .orElseThrow(() -> new MessageException("The required message is not found", ExceptionReason.MESSAGE_NOT_FOUND.name()));

        if (message.getUser().getId() == fromUser.getId()) {
            this.messageRepository.delete(message);
        } else {
            throw new MessageException("You are not authorized for this task",ExceptionReason.FORBIDDEN_ACCESS.name());
        }
    }
}
