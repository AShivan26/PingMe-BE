package com.project.service.contract;

import lombok.*;

import java.util.ArrayList;
import java.util.UUID;

@Getter
@Setter
@Data
@NoArgsConstructor
@AllArgsConstructor
public class GroupChatRequestObject {
    private ArrayList<UUID> userIds;
    private String chatName;
    private String chatImage;
}
