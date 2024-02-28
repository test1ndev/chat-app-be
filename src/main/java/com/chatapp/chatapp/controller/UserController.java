package com.chatapp.chatapp.controller;

import com.chatapp.chatapp.dto.UserDTO;
import com.chatapp.chatapp.models.ChatMessage;
import com.chatapp.chatapp.models.User;
import com.chatapp.chatapp.repository.UserRepository;
import com.chatapp.chatapp.service.UserService;
import org.springframework.beans.factory.annotation.Autowire;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/add-user")
    public User addUser(@RequestBody User user){
        return userService.saveUser(user);
    }

    @GetMapping("/get-friends")
    public List<User> findUsers(){
        return userService.findFriends();
    }


}
