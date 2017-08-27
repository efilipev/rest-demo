package com.example.demo.repositories;

import com.example.demo.model.TeamProfile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeamProfileRepository extends MongoRepository<TeamProfile,String> {

    TeamProfile findTeamProfileByMarketName(String marketName);
    TeamProfile findTeamProfileByTeamName(String teamName);

}
