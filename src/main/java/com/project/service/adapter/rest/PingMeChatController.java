package com.project.service.adapter.rest;

import com.project.service.ChatService;
import com.project.service.HelperService;
import com.project.service.UserService;
import com.project.service.adapter.mapper.DomainToResponseGetAllUsersMapper;
import com.project.service.contract.ApiResponseObject;
import com.project.service.contract.GroupChatRequestObject;
import com.project.service.contract.SingleChatRequestObject;
import com.project.service.contract.UserResponseObject;
import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pingme/chats")
public class PingMeChatController {

    @Autowired
    private ChatService chatService;

    @Autowired
    private HelperService helperService;

    @Autowired
    private UserService userService;

    @Autowired
    private DomainToResponseGetAllUsersMapper domainToResponseGetAllUsersMapper;


    @PostMapping("/single")
    public ResponseEntity<ChatEntity> createChat(@RequestBody SingleChatRequestObject singleChatRequest,
                                                 @RequestHeader("Authorization") String jwt) throws UserException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        ChatEntity chat = this.chatService.createChat(reqUser, singleChatRequest.getToUserId());
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.CREATED);
    }

    @DeleteMapping("/delete/{chatId}")
    public ResponseEntity<ApiResponseObject> deleteChat(@PathVariable UUID chatId,
                                                        @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        chatService.deleteChat(chatId, reqUser);
        ApiResponseObject res = new ApiResponseObject("Deleted Successfully...", false);
        return new ResponseEntity<ApiResponseObject>(res, HttpStatus.OK);
    }

    @PostMapping("/group")
    public ResponseEntity<ChatEntity> createGroup(@RequestBody GroupChatRequestObject groupChatRequest,
                                                  @RequestHeader("Authorization") String jwt) throws UserException {
        System.out.println(groupChatRequest);
        UserEntity reqUser = helperService.findUserProfile(jwt);
        ArrayList<UUID> list = groupChatRequest.getUserIds();
        list.add(reqUser.getId());
        groupChatRequest.setUserIds(list);
        ChatEntity chat = chatService.createGroup(groupChatRequest, reqUser);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.CREATED);
    }

    @GetMapping("/{chatId}")
    public ResponseEntity<ChatEntity> findChatById(@PathVariable UUID chatId) throws ChatException {
        ChatEntity chat = chatService.findChatById(chatId);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.OK);
    }

    @GetMapping("/user")
    public ResponseEntity<List<ChatEntity>> findChatByUserId(@RequestHeader("Authorization") String jwt)
            throws UserException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        List<ChatEntity> chats = chatService.findAllChatByUserId(reqUser.getId());
        return new ResponseEntity<List<ChatEntity>>(chats, HttpStatus.OK);
    }

    @PutMapping("/{chatId}/add/{userId}")
    public ResponseEntity<ChatEntity> addUserToGroup(@PathVariable UUID chatId,
                                                     @PathVariable UUID userId,
                                                     @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        ChatEntity chat = chatService.addUserToGroup(userId, chatId, reqUser);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.OK);
    }

    @PutMapping("/{chatId}/remove/{userId}")
    public ResponseEntity<ChatEntity> removeUserFromGroup(@PathVariable UUID chatId,
                                                          @PathVariable UUID userId,
                                                          @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        ChatEntity chat = chatService.removeFromGroup(userId, chatId, reqUser);
        return new ResponseEntity<ChatEntity>(chat, HttpStatus.OK);
    }

    @PostMapping("/logout")
    public ResponseEntity<Boolean> pingMeLogout(@RequestHeader("Authorization") String jwt) throws UserException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        Boolean response = userService.logOutUser(reqUser);
        return new ResponseEntity<Boolean>(response, HttpStatus.OK);
    }

    @GetMapping("/users")
    public ResponseEntity<List<UserResponseObject>> pingMeGetAllUsers(@RequestHeader("Authorization") String jwt) throws UserException {
        UserEntity reqUser = helperService.findUserProfile(jwt);
        List<UserEntity> listOfOnlineUsers = userService.getAllUsers(reqUser.getId());
        List<UserResponseObject> pingMeResponseObjects = domainToResponseGetAllUsersMapper.PingMeGetAllUsersResponseMapper(listOfOnlineUsers);
        return new ResponseEntity<List<UserResponseObject>>(pingMeResponseObjects, HttpStatus.OK);
    }
}
