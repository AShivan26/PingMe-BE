package com.project.service;

import com.project.service.contract.GroupChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.UserException;

import java.util.List;
import java.util.UUID;

public interface ChatService {
    ChatEntity createChat(UserEntity fromUser, UUID toUserId) throws UserException;

    void deleteChat(UUID chatId, UserEntity reqUser) throws ChatException, UserException;

    ChatEntity findChatById(UUID chatId) throws ChatException;

    ChatEntity createGroup(GroupChatRequestObject req, UserEntity reqUser) throws UserException;

    List<ChatEntity> findAllChatByUserId(UUID userId) throws UserException;

    ChatEntity addUserToGroup(UUID userId, UUID chatId, UserEntity reqUser) throws UserException, ChatException;

    ChatEntity removeFromGroup(UUID chatId, UUID userId, UserEntity reqUser) throws UserException, ChatException;
}
