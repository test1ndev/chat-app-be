package com.chatapp.chatapp.service;

import com.chatapp.chatapp.models.ChatMessage;

import java.util.List;

public interface ChatMessageService {
    ChatMessage save(ChatMessage chatMessage);
    List<ChatMessage> findChatMessages(String senderId, String recipientId);
}
