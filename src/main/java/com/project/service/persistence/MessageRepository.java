package com.project.service.persistence;

import com.project.service.entity.MessageEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.UUID;

public interface MessageRepository extends JpaRepository<MessageEntity, UUID> {
    @Query("select m from MessageEntity m join m.chat c where c.id=:chatId")
    public List<MessageEntity> findByChatId(@Param("chatId") UUID chatId);
}
