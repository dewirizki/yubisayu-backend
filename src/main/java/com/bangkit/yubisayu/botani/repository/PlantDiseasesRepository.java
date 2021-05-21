package com.bangkit.yubisayu.botani.repository;

import com.bangkit.yubisayu.botani.model.entities.plant.PlantDiseases;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Mono;

@Repository
public interface PlantDiseasesRepository  extends R2dbcRepository<PlantDiseases, String> {
    Mono<PlantDiseases> findById(String id);
}
