package com.example.test;

import com.example.demo.model.HockeyPlayer;
import com.example.demo.model.TeamProfile;
import com.example.demo.repositories.HockeyPlayerRepository;
import com.example.demo.repositories.TeamProfileRepository;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.data.mongo.DataMongoTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;

@RunWith(SpringRunner.class)
@DataMongoTest
public class TeamProfileRepositoryTest {

    @Autowired
    private TeamProfileRepository teamProfileRepository;
    @Autowired
    private HockeyPlayerRepository hockeyPlayerRepository;

    @Before
    public void setup(){

        teamProfileRepository.save(new TeamProfile("Los Angeles","Kings","Staples Center",18118,"Los Angeles",
                "USA","NHL","Western","Pacific", Arrays.asList(new HockeyPlayer("59a03c22c775fd4b007035a7",
                        "Derek Forbort",76,212,"24","Duluth, MN, USA","1992-03-04",
                        2010),new HockeyPlayer("59a03c22c775fd4b007035a8","Anthony Duclair", 76, 204, "54",
                        "Kitchener, ON, CAN", "1995-07-20", 2010),
                new HockeyPlayer("59a03c22c775fd4b007035a4","Tanner Pearson",73,208,"70","Kitchener, ON, CAN","1992-08-10",2012))));
    }

    @Test
    public void testTeamRosterByFullName(){
        TeamProfile teamProfile = teamProfileRepository.findTeamProfileByMarketName("Los Angeles");
        assertThat(teamProfile.getMarketName(),is("Los Angeles"));
        assertThat(teamProfile.getTeamNAme(),is("Kings"));
        assertThat(teamProfile.getVenueName(),is("Staples Center"));
        assertThat(teamProfile.getCapacity(),is(18118));
        assertThat(teamProfile.getCity(),is("Los Angeles"));
        assertThat(teamProfile.getCountry(),is("USA"));
        assertThat(teamProfile.getLeagueName(),is("NHL"));
        assertThat(teamProfile.getConference(),is("Western"));
        assertThat(teamProfile.getDivision(),is("Pacific"));
    }

    @Test
    public void testTeamProfileByTeamName(){

        TeamProfile teamProfile = teamProfileRepository.findTeamProfileByTeamName("Kings");
        assertThat(teamProfile.getMarketName(),is("Los Angeles"));
        assertThat(teamProfile.getTeamNAme(),is("Kings"));
        assertThat(teamProfile.getVenueName(),is("Staples Center"));
        assertThat(teamProfile.getCapacity(),is(18118));
        assertThat(teamProfile.getCity(),is("Los Angeles"));
        assertThat(teamProfile.getCountry(),is("USA"));
        assertThat(teamProfile.getLeagueName(),is("NHL"));
        assertThat(teamProfile.getConference(),is("Western"));
        assertThat(teamProfile.getDivision(),is("Pacific"));
    }

    @Test
    public void testHockeyPlayer(){
        HockeyPlayer player = hockeyPlayerRepository.findByFullName("Derek Forbort");
        assertThat(player.getFullName(),is("Derek Forbort"));
        assertThat(player.getHeight(),is(76));
        assertThat(player.getWeight(),is(212));
        assertThat(player.getJerseyNumber(),is("24"));
        assertThat(player.getBirthPlace(),is("Duluth, MN, USA"));
        assertThat(player.getBirthdate(),is("1992-03-04"));
        assertThat(player.getYearOfDraft(),is(2010));

    }
}
