package com.bangkit.yubisayu.botani.service.impl;

import com.bangkit.yubisayu.botani.model.entities.user.User;
import com.bangkit.yubisayu.botani.repository.UserRepository;
import com.bangkit.yubisayu.botani.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Mono<User> getUserById(String id) {
        return userRepository.findById(id);
    }
}
