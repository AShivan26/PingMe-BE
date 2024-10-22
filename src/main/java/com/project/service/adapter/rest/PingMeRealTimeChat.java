package com.project.service.adapter.rest;

import com.project.service.entity.MessageEntity;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.messaging.simp.SimpMessagingTemplate;

public class PingMeRealTimeChat {
    private SimpMessagingTemplate simpMessagingTemplate;

    @MessageMapping("/message")
    @SendTo("/group/public")
    public MessageEntity receiveMessage(@Payload MessageEntity message) {
        simpMessagingTemplate.convertAndSend("/group" + message.getChat().getId().toString(), message);
        return message;
    }

}
