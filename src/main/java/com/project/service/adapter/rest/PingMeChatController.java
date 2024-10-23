package com.project.service.adapter.rest;

import com.project.service.ChatService;
import com.project.service.ChatServiceImpl;
import com.project.service.contract.ApiResponseObject;
import com.project.service.contract.GroupChatRequestObject;
import com.project.service.contract.SingleChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/pingme/chats")
public class PingMeChatController {

    @Autowired
    private ChatService chatService;

    @PostMapping("/single")
    public ResponseEntity<ChatEntity> createChat(@RequestBody SingleChatRequestObject singleChatRequest) throws UserException {
        ChatEntity chat = this.chatService.createChat(singleChatRequest.getFromUserId(), singleChatRequest.getToUserId());
        return new ResponseEntity<>(chat, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{chatId}/{userId}")
    public ResponseEntity<ApiResponseObject> deleteChat(@PathVariable UUID chatId, @PathVariable UUID userId) throws UserException, ChatException {
        chatService.deleteChat(chatId, userId);
        ApiResponseObject res = new ApiResponseObject("Deleted Successfully...", false);
        return new ResponseEntity<ApiResponseObject>(res, HttpStatus.OK);
    }

    @PostMapping("/group")
    public ResponseEntity<ChatEntity> createGroup(@RequestBody GroupChatRequestObject groupChatRequest) throws UserException {
        System.out.println(groupChatRequest);
        ChatEntity chat = chatService.createGroup(groupChatRequest);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.CREATED);
    }

}
