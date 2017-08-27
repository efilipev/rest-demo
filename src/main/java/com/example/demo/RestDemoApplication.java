package com.example.demo;

import com.example.demo.model.TeamProfile;
import com.example.demo.model.TeamProfileRoster;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@EnableCaching
@SpringBootApplication
public class RestDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestDemoApplication.class, args);
	}

	@Bean
	public RestTemplate instantiateRestTemplate() {
		return new RestTemplate();
	}

	@Bean
	List<TeamProfile> getListRoster(){
		return new ArrayList<>();
	}

	@Bean
	List<TeamProfileRoster> getProfileRosters(){
		return new ArrayList<>();
	}

}
