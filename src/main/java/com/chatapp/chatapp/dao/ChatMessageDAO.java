package com.chatapp.chatapp.dao;

import com.chatapp.chatapp.models.ChatMessage;

import java.util.List;

public interface ChatMessageDAO {

    List<ChatMessage> findChatBySenderAndReceiver(String senderId, String recipientId);
}
