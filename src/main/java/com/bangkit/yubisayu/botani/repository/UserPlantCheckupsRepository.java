package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.user.UserPlantCheckups;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import reactor.core.publisher.Mono;

public interface UserPlantCheckupsRepository extends R2dbcRepository<UserPlantCheckups, String> {
    Mono<UserPlantCheckups> findById(String id);
}