package com.example.test;

import com.example.demo.model.TeamProfileRoster;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


@RunWith(SpringJUnit4ClassRunner.class)
public class TeamProfileClientTest {

    TestRestTemplate restTemplate = new TestRestTemplate();
    private ResponseEntity<TeamProfileRoster> responseEntity;
    String url = "http://api.sportradar.us/nhl-ot4/teams/44153da1-0f24-11e2-8525-18a905767e44/profile.json?api_key=4tvsu5uydx6ugn6bvt8py47u";

    @Before
    public void setup() throws InterruptedException {
        responseEntity = restTemplate.getForEntity(url,TeamProfileRoster.class);
    }

    @Test
    public void testStatusCode() throws Exception {
        HttpStatus statusCode = responseEntity.getStatusCode();
        assertThat(statusCode.value(),is(200));

    }

    @Test
    public void testId (){
        String teamId = responseEntity.getBody().getId();
        assertThat(teamId,is("44153da1-0f24-11e2-8525-18a905767e44"));
    }

    @Test
    public void testTeamProfileNotNull(){
        Assert.assertNotNull(responseEntity.getBody());
    }

    @Test
    public void testTeamName(){
        String name = responseEntity.getBody().getName();
        System.out.println(name);
        assertThat(name,is("Coyotes"));
    }


}
