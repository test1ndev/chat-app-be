package com.chatapp.chatapp.serviceImpl;

import com.chatapp.chatapp.models.User;
import com.chatapp.chatapp.repository.UserRepository;
import com.chatapp.chatapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public User saveUser(User user) {
        return userRepository.save(user);
    }

    @Override
    public List<User> findFriends() {
        return userRepository.findAll();
    }
}
