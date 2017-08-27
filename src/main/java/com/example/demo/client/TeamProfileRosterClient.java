package com.example.demo.client;

import com.example.demo.model.TeamProfileRoster;
import com.example.demo.model.TeamsHelper;
import com.google.common.collect.ImmutableMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.ExecutionException;

@Component
public class TeamProfileRosterClient {

    @Autowired
    private RestTemplate restTemplate;
    @Value("${url}")
    private String teamProfileURL;
    private ResponseEntity<TeamProfileRoster> responseEntity;


    public ResponseEntity<TeamProfileRoster> getResponseEntity(String teamName) throws ExecutionException, InterruptedException {

        String teamId = getTeamId(teamName);
        responseEntity = restTemplate.getForEntity(teamProfileURL, TeamProfileRoster.class, ImmutableMap.of("teamid", teamId));
        return responseEntity;
    }

    public String getTeamId(String team){
       String currentTeam = TeamsHelper.teamIdHolder().get(team);
       return currentTeam;
   }


}
