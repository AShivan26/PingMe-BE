package com.project.service.adapter.rest;

import com.project.service.ChatService;
import com.project.service.UserServiceHelper;
import com.project.service.contract.ApiResponseObject;
import com.project.service.contract.GroupChatRequestObject;
import com.project.service.contract.SingleChatRequestObject;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
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

    @Autowired
    private UserServiceHelper userServiceHelper;

    @PostMapping("/single")
    public ResponseEntity<ChatEntity> createChat(@RequestBody SingleChatRequestObject singleChatRequest,@RequestHeader("Authorization") String jwt) throws UserException {
        UserEntity reqUser = userServiceHelper.findUserProfile(jwt);
        ChatEntity chat = this.chatService.createChat(reqUser, singleChatRequest.getToUserId());
        return new ResponseEntity<>(chat, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{chatId}")
    public ResponseEntity<ApiResponseObject> deleteChat(@PathVariable UUID chatId, @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity reqUser = userServiceHelper.findUserProfile(jwt);
        chatService.deleteChat(chatId, reqUser);
        ApiResponseObject res = new ApiResponseObject("Deleted Successfully...", false);
        return new ResponseEntity<ApiResponseObject>(res, HttpStatus.OK);
    }

    @PostMapping("/group")
    public ResponseEntity<ChatEntity> createGroup(@RequestBody GroupChatRequestObject groupChatRequest, @RequestHeader("Authorization") String jwt) throws UserException {
        System.out.println(groupChatRequest);
        UserEntity reqUser = userServiceHelper.findUserProfile(jwt);
        ChatEntity chat = chatService.createGroup(groupChatRequest,reqUser);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.CREATED);
    }

}
