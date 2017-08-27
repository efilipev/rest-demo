package com.example.demo;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;

import java.net.UnknownHostException;

@Configuration
public class MongoConfig {

    @Bean
    public MongoDbFactory mongoDbFactory() throws UnknownHostException {
        MongoClientURI uri = new MongoClientURI("mongodb://localhost/admin");
        return new SimpleMongoDbFactory(new MongoClient(uri), "admin");
    }

    @Bean
    public MongoOperations mongoTemplate() throws UnknownHostException{
        return new MongoTemplate(mongoDbFactory());
    }
}
