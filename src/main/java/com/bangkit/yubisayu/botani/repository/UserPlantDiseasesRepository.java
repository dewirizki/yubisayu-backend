package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.user.UserPlantDiseases;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface UserPlantDiseasesRepository extends R2dbcRepository<UserPlantDiseases, String> {
    Mono<UserPlantDiseases> findById(String id);
}