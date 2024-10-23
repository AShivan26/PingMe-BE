package com.project.service.adapter.rest;

import com.project.service.HelperService;
import com.project.service.MessageService;
import com.project.service.contract.ApiResponseObject;
import com.project.service.contract.SendMessageRequest;
import com.project.service.entity.MessageEntity;
import com.project.service.entity.UserEntity;
import com.project.service.exception.ChatException;
import com.project.service.exception.MessageException;
import com.project.service.exception.UserException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/pingme/messages")
public class PingMeMessageController {

    @Autowired
    private MessageService messageService;

    @Autowired
    private HelperService helperService;

    @PostMapping("/create")
    public ResponseEntity<MessageEntity> sendMessage(@RequestBody SendMessageRequest sendMessageRequest,
                                                     @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity user = helperService.findUserProfile(jwt);
        sendMessageRequest.setUserId(user.getId());
        MessageEntity message = this.messageService.sendMessage(sendMessageRequest);
        return new ResponseEntity<MessageEntity>(message, HttpStatus.OK);
    }

    @GetMapping("/{chatId}")
    public ResponseEntity<List<MessageEntity>> getChatMessage(@PathVariable UUID chatId,
                                                              @RequestHeader("Authorization") String jwt) throws UserException, ChatException {
        UserEntity user = helperService.findUserProfile(jwt);
        List<MessageEntity> messages = messageService.getChatsMessages(chatId, user);
        return new ResponseEntity<List<MessageEntity>>(messages, HttpStatus.OK);
    }

    @DeleteMapping("/{messageId}")
    public ResponseEntity<ApiResponseObject> deleteMessage(@PathVariable UUID messageId,
                                                           @RequestHeader("Authorization") String jwt) throws UserException, MessageException {
        UserEntity user = helperService.findUserProfile(jwt);
        messageService.deleteMessage(messageId, user);
        ApiResponseObject res = new ApiResponseObject("Deleted successfully......", false);
        return new ResponseEntity<ApiResponseObject>(res, HttpStatus.OK);
    }
}
