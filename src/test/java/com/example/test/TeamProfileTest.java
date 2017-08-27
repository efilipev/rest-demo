package com.example.test;

import com.example.demo.model.HockeyPlayer;
import com.example.demo.model.TeamProfile;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.Matchers.not;

@RunWith(SpringJUnit4ClassRunner.class)
public class TeamProfileTest {

    private TeamProfile teamProfile;

    @Before
    public void beforeTest(){
        teamProfile = new TeamProfile("Los Angeles","Kings","Staples Center",18118,"Los Angeles",
                "USA","NHL","Western","Pacific", Arrays.asList(new HockeyPlayer("59a03c22c775fd4b007035a7",
                        "Derek Forbort",76,212,"24","Duluth, MN, USA","1992-03-04",
                        2010),new HockeyPlayer("59a03c22c775fd4b007035a8","Anthony Duclair", 76, 204, "54",
                        "Kitchener, ON, CAN", "1995-07-20", 2010),
                new HockeyPlayer("59a03c22c775fd4b007035a4","Tanner Pearson",73,208,"70","Kitchener, ON, CAN","1992-08-10",2012)));
    }

    @Test
    public void testTeamProfileNotNull(){
        Assert.assertNotNull(teamProfile);
    }

    @Test
    public void testTeamProfile(){
        assertThat(teamProfile.getMarketName(), is("Los Angeles"));
        assertThat(teamProfile.getTeamNAme(), is("Kings"));
        assertThat(teamProfile.getVenueName(), is("Staples Center"));
        assertThat(teamProfile.getCapacity(), is(18118));
        assertThat(teamProfile.getCity(), is("Los Angeles"));
        assertThat(teamProfile.getCountry(), is("USA"));
        assertThat(teamProfile.getLeagueName(), is("NHL"));
        assertThat(teamProfile.getConference(), is("Western"));
        assertThat(teamProfile.getDivision(), is("Pacific"));
    }

    @Test
    public void testTeamProfilePlayers(){
        List<HockeyPlayer> players = teamProfile.getPlayerModel();
        HockeyPlayer player = players.get(2);
        assertThat(player.getFullName(), is("Tanner Pearson"));
        assertThat(player.getHeight(), is(73));
        assertThat(player.getWeight(), is(208));
        assertThat(player.getJerseyNumber(), is("70"));
        assertThat(player.getBirthPlace(), is("Kitchener, ON, CAN"));
        assertThat(player.getBirthdate(), is("1992-08-10"));
        assertThat(player.getYearOfDraft(), is(2012));
    }

    @Test
    public void testTeamProfileIsNotTheSame(){
        assertThat(teamProfile.getMarketName(), not("L Angeles"));
        assertThat(teamProfile.getTeamNAme(), not("Kngs"));
        assertThat(teamProfile.getVenueName(), not("staples Center"));
        assertThat(teamProfile.getCapacity(), not(18418));
        assertThat(teamProfile.getCity(), not("LosAngeles"));
        assertThat(teamProfile.getCountry(), not("uSA"));
        assertThat(teamProfile.getLeagueName(), not("NhL"));
        assertThat(teamProfile.getConference(), not("Weern"));
        assertThat(teamProfile.getDivision(), not("Paiic"));
    }

    @Test
    public void testTeamProfilePlayersIsNotTheSame(){
        List<HockeyPlayer> players = teamProfile.getPlayerModel();
        HockeyPlayer player = players.get(2);
        assertThat(player.getFullName(), not("TannerPearson"));
        assertThat(player.getHeight(), not(76));
        assertThat(player.getWeight(), not(209));
        assertThat(player.getJerseyNumber(), not("75"));
        assertThat(player.getBirthPlace(), not("kitchener, ON, CAN"));
        assertThat(player.getBirthdate(), not("1992-08-0"));
        assertThat(player.getYearOfDraft(), not(212));
    }

}
