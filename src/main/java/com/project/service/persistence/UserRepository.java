package com.project.service.persistence;

import com.project.service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserRepository extends JpaRepository<UserEntity, UUID> {
    // Custom query to find ID by NAME and PASSWORD
    @Query("SELECT u FROM UserEntity u WHERE u.name = :name AND u.password = :password")
    UserEntity findByNameAndPassword(@Param("name") String name, @Param("password") String password);
}
