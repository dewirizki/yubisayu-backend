package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.plant.Plants;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PlantsRepository extends R2dbcRepository<Plants, String> {
    Mono<Plants> findById(String id);
}
