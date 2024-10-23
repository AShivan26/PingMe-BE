package com.project.service.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name = "person")
@NoArgsConstructor
@AllArgsConstructor
@Data
public class UserEntity {

    @Id
    @Column(name="id", unique = true, nullable = false)
    private UUID id = UUID.randomUUID();

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "online")
    private boolean online;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "profile")
    private String profile;
}
