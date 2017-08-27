package com.example.demo.repositories;

import com.example.demo.model.HockeyPlayer;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HockeyPlayerRepository extends MongoRepository<HockeyPlayer,String> {
    HockeyPlayer findByFullName(String fullName);
}
