package com.project.service;

import com.project.service.contract.GroupChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.UserException;

import java.util.UUID;

public interface ChatService {
    ChatEntity createChat(UUID fromUseId, UUID toUserId) throws UserException;

    void deleteChat(UUID chatId, UUID userId) throws ChatException, UserException;

    ChatEntity findChatById(UUID chatId) throws ChatException;

    ChatEntity createGroup(GroupChatRequestObject req) throws UserException;
}
