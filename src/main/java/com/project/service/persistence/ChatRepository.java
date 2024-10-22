package com.project.service.persistence;

import com.project.service.entity.ChatEntity;
import com.project.service.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface ChatRepository extends JpaRepository<ChatEntity, UUID> {

    @Query("select c from ChatEntity c join c.users u where u.id=:userId")
    public List<ChatEntity> findChatByUserId(@Param("userId") UUID userId);

    @Query("select c from ChatEntity c where c.isGroup=false and :user member of c.users and :reqUser member of c.users")
    public ChatEntity findSingleChatByUserIds(@Param("user") UserEntity user, @Param("reqUser") UserEntity reqUser);

}
