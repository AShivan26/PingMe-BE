package com.project.service.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.*;

@Entity
@Table(name = "chats")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class ChatEntity {

    @Id
    @Column(name = "id", unique = true, nullable = false)
    private UUID id  = UUID.randomUUID();;

    @Column(name = "chat_name")
    private String chatName;

    @Column(name = "chat_image")
    private String chatImage;

    @Column(name = "is_group", nullable = false)
    private boolean isGroup;

    @ManyToMany
    @JoinTable(
            name = "chat_admins",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<UserEntity> admins = new HashSet<>();

    @ManyToOne
    @JoinColumn(name = "created_by_user_id", nullable = false)
    private UserEntity createdBy;

    @ManyToMany
    @JoinTable(
            name = "chat_users",
            joinColumns = @JoinColumn(name = "chat_id"),
            inverseJoinColumns = @JoinColumn(name = "user_id")
    )
    private Set<UserEntity> users = new HashSet<>();

    @OneToMany(mappedBy = "chat", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<MessageEntity> messages = new ArrayList<>();
}

