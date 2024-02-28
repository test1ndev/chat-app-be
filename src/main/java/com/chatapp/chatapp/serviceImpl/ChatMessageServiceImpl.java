package com.chatapp.chatapp.serviceImpl;

import com.chatapp.chatapp.dao.ChatMessageDAO;
import com.chatapp.chatapp.models.ChatMessage;
import com.chatapp.chatapp.repository.ChatMessageRepository;
import com.chatapp.chatapp.service.ChatMessageService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ChatMessageServiceImpl implements ChatMessageService {

    private final ChatMessageRepository chatMessageRepository;
    private final ChatMessageDAO chatMessageDAO;

    @Override
    public ChatMessage save(ChatMessage chatMessage) {
        return chatMessageRepository.save(chatMessage);
    }

    @Override
    public List<ChatMessage> findChatMessages(String senderId, String recipientId) {
        return chatMessageDAO.findChatBySenderAndReceiver(senderId,recipientId);
    }
}
