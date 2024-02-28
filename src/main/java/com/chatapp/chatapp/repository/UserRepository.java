package com.chatapp.chatapp.repository;

import com.chatapp.chatapp.models.User;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface UserRepository extends MongoRepository<User,String>{

}
