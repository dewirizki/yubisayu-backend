package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.Users;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserRepository extends R2dbcRepository<Users, String> {
    Mono<Users> findById(String id);
}
