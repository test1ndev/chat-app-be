package com.chatapp.chatapp.repository;

import com.chatapp.chatapp.models.ChatMessage;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ChatMessageRepository extends MongoRepository<ChatMessage, String> {
}
