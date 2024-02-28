package com.chatapp.chatapp.service;

import com.chatapp.chatapp.dto.UserDTO;
import com.chatapp.chatapp.models.User;

import java.util.List;

public interface UserService {
    User saveUser(User user);
    List<User> findFriends();
}
