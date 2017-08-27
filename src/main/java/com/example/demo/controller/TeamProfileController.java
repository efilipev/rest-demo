package com.example.demo.controller;

import com.example.demo.model.TeamProfile;
import com.example.demo.service.TeamProfileRosterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.ExecutionException;

@RestController
@RequestMapping
public class TeamProfileController {

    @Autowired
    private TeamProfileRosterService teamProfileRosterService;

    @Cacheable("cahce")
    @RequestMapping(value = "/roster/{teamName}")
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody TeamProfile getTeamProfile(@PathVariable("teamName") String teamName) throws ExecutionException, InterruptedException {
         return teamProfileRosterService.getResponse(teamName);

    }
}
