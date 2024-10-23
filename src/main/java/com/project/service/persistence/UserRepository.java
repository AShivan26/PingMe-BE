package com.project.service.persistence;

import com.project.service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    Optional<UserEntity> findByNameAndPassword(@Param("name") String name, @Param("password") String password);

    ArrayList<UserEntity> findAllByOnline(boolean online);

    Optional<UserEntity> findByName(String name);

    UserEntity findByEmail(String email);
}
