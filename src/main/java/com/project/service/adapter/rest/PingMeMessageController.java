package com.project.service.adapter.rest;

import com.project.service.MessageService;
import com.project.service.contract.ApiResponseObject;
import com.project.service.contract.SendMessageRequest;
import com.project.service.entity.MessageEntity;
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
@RequestMapping("/api/messages")
public class PingMeMessageController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/create")
    public ResponseEntity<MessageEntity> sendMessage(@RequestBody SendMessageRequest sendMessageRequest) throws UserException, ChatException {
        MessageEntity message = this.messageService.sendMessage(sendMessageRequest);
        return new ResponseEntity<MessageEntity>(message, HttpStatus.OK);
    }

    @GetMapping("/{chatId}/{userId}")
    public ResponseEntity<List<MessageEntity>> getChatMessage(@PathVariable UUID chatId, @PathVariable UUID userId) throws UserException, ChatException {
        List<MessageEntity> messages = messageService.getChatsMessages(chatId, userId);
        return new ResponseEntity<List<MessageEntity>>(messages, HttpStatus.OK);
    }

    @DeleteMapping("/{messageId}/{userId}")
    public ResponseEntity<ApiResponseObject> deleteMessage(@PathVariable UUID messageId, @PathVariable UUID userId) throws UserException, ChatException, MessageException {
        messageService.deleteMessage(messageId, userId);
        ApiResponseObject res = new ApiResponseObject("Deleted successfully......", false);
        return new ResponseEntity<ApiResponseObject>(res, HttpStatus.OK);
    }
}
