package com.example.demo.service;

import com.example.demo.client.TeamProfileRosterClient;
import com.example.demo.model.HockeyPlayer;
import com.example.demo.model.Player;
import com.example.demo.model.TeamProfile;
import com.example.demo.model.TeamProfileRoster;
import com.example.demo.repositories.HockeyPlayerRepository;
import com.example.demo.repositories.TeamProfileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.util.Assert;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.stream.Collectors;

@Service
public class TeamProfileRosterService {

    private TeamProfileRosterClient teamProfileRosterClient;
    private TeamProfileRepository profileRepository;
    private HockeyPlayerRepository hockeyPlayerRepository;

    @Autowired
    public TeamProfileRosterService(TeamProfileRosterClient teamProfileRosterClient, TeamProfileRepository profileRepository, HockeyPlayerRepository hockeyPlayerRepository) {
        this.teamProfileRosterClient = teamProfileRosterClient;
        this.profileRepository = profileRepository;
        this.hockeyPlayerRepository = hockeyPlayerRepository;

    }

    public TeamProfile getResponse(String teamName) throws ExecutionException, InterruptedException {
        ResponseEntity<TeamProfileRoster> responseEntity = teamProfileRosterClient.getResponseEntity(teamName);
        TeamProfile teamProfile = toTeamProfile(responseEntity.getBody());
        hockeyPlayerRepository.save(teamProfile.getPlayerModel());
        profileRepository.save(teamProfile);
        System.out.println(teamProfile);
        return teamProfile;
    }

    public TeamProfile toTeamProfile(TeamProfileRoster teamRoster){
        Assert.notNull(teamRoster, "'teamRoster' must not be null");
        return new TeamProfile(teamRoster.getMarket(),teamRoster.getName(),teamRoster.getVenue().getName(),teamRoster.getVenue().getCapacity(),
                teamRoster.getVenue().getCity(),teamRoster.getVenue().getCountry(),teamRoster.getLeague().getName(), convertConferenceToLowerCase(teamRoster),
                teamRoster.getDivision().getName(),parsePlayer(teamRoster.getPlayers()));
    }

    public List<HockeyPlayer> parsePlayer(List<Player> playerList){
        Assert.notNull(playerList, "'playerList' must not be null");
        return playerList.stream().map(this::toHockeyPlayer).collect(Collectors.toList());
    }

    public HockeyPlayer toHockeyPlayer(Player player){
        Assert.notNull(player, "'player' must not be null");
        HockeyPlayer hockeyPlayer = new HockeyPlayer(player.getId(),player.getFullName(),player.getHeight(),player.getWeight(),
                player.getJerseyNumber(), player.getBirthPlace(),player.getBirthdate(),player.getDraft().getYear());
        return hockeyPlayer;
    }

    public String convertConferenceToLowerCase(TeamProfileRoster teamRoster){
        return teamRoster.getConference().getName().charAt(0) + teamRoster.getConference().getName().substring(1,7).toLowerCase();
    }

}
