package com.example.test;

import com.example.demo.controller.TeamProfileController;
import com.example.demo.model.HockeyPlayer;
import com.example.demo.model.TeamProfile;
import com.example.demo.service.TeamProfileRosterService;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.concurrent.ExecutionException;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.BDDMockito.given;

@RunWith(SpringRunner.class)
public class TeamProfileControllerTest {

    @Mock
    private TeamProfileRosterService rosterService;
    @InjectMocks
    private TeamProfileController controller;
    TeamProfile teamProfile;

    @Before
    public void setup() throws ExecutionException, InterruptedException {
        teamProfile = new TeamProfile("Los Angeles","Kings","Staples Center",18118,"Los Angeles",
                "USA","NHL","Western","Pacific", Arrays.asList(new HockeyPlayer("59a03c22c775fd4b007035a7",
                        "Derek Forbort",76,212,"24","Duluth, MN, USA","1992-03-04",
                        2010),new HockeyPlayer("59a03c22c775fd4b007035a8","Anthony Duclair", 76, 204, "54",
                        "Kitchener, ON, CAN", "1995-07-20", 2010),
                new HockeyPlayer("59a03c22c775fd4b007035a4","Tanner Pearson",73,208,"70","Kitchener, ON, CAN","1992-08-10",2012)));
        given(rosterService.getResponse("Kings")).willReturn(teamProfile);
    }

    @Test
    public void testTeamProfileController() throws ExecutionException, InterruptedException {
        TeamProfile profile = controller.getTeamProfile("Kings");
        assertThat(profile.getClass().getTypeName(),is("com.example.demo.model.TeamProfile"));
    }


}
