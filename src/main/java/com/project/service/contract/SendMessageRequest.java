package com.project.service.contract;

import lombok.*;

import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class SendMessageRequest {
    private UUID userId;
    private UUID chatId;
    private String content;
}
