package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.user.UserPlants;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserPlantsRepository extends R2dbcRepository<UserPlants, String> {
    Mono<UserPlants> findById(String id);
}
