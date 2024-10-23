package com.project.service.contract;

import lombok.*;

import java.util.List;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatRequestObject {
    private List<UUID> userIds;
    private String chatName;
    private String chatImage;
    private UUID fromId;
}
