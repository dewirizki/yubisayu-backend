package com.bangkit.yubisayu.botani.service;

import com.bangkit.yubisayu.botani.model.entities.user.Users;
import reactor.core.publisher.Mono;

public interface UserService {
    Mono<Users> getUserById(String id);
}
