package com.bangkit.yubisayu.botani.service;

import com.bangkit.yubisayu.botani.model.entities.user.User;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<User> getUserById(String id);
}
