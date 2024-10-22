package com.project.service.contract;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Builder
public class SingleChatRequestObject {
    private UUID toUserId;
    private UUID fromUserId;
}
