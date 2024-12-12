package com.project.service.persistence;

import com.project.service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {

    ArrayList<UserEntity> findAllByOnline(boolean online);

    UserEntity findByEmail(String email);
}
