package com.project.service;

import com.project.service.contract.SendMessageRequest;
import com.project.service.entity.MessageEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.MessageException;
import com.project.service.exception.UserException;

import java.util.List;
import java.util.UUID;

public interface MessageService {
    MessageEntity sendMessage(SendMessageRequest req) throws UserException, ChatException;

    List<MessageEntity> getChatsMessages(UUID chatId, UserEntity fromUser) throws ChatException, UserException;

    void deleteMessage(UUID messageId, UserEntity fromUser) throws MessageException, UserException;
}
