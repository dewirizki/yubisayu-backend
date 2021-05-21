package com.bangkit.yubisayu.botani.service.impl;

import com.bangkit.yubisayu.botani.model.entities.user.Users;
import com.bangkit.yubisayu.botani.repository.UsersRepository;
import com.bangkit.yubisayu.botani.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UsersRepository usersRepository;

    @Override
    public Mono<Users> getUserById(String id) {
        return usersRepository.findById(id);
    }
}
