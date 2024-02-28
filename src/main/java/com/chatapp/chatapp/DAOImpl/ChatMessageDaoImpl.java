package com.chatapp.chatapp.DAOImpl;

import com.chatapp.chatapp.dao.ChatMessageDAO;
import com.chatapp.chatapp.models.ChatMessage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ChatMessageDaoImpl implements ChatMessageDAO {
    @Autowired
    MongoTemplate mongoTemplate;
    @Override
    public List<ChatMessage> findChatBySenderAndReceiver(String senderId, String recipientId) {
        Query query = new Query();
        Criteria criteria = new Criteria().orOperator(
                Criteria.where("senderId").is(senderId).andOperator(Criteria.where("recipientId").is(recipientId)),
                Criteria.where("senderId").is(recipientId).andOperator(Criteria.where("recipientId").is(senderId))
        );
        query.addCriteria(criteria);

        List<ChatMessage> results = mongoTemplate.find(query, ChatMessage.class);
        return results;
    }
}