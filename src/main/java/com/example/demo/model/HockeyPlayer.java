package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class HockeyPlayer {

    @Id
    private String id;
    private String fullName;
    private Integer height;
    private Integer weight;
    private String jerseyNumber;
    private String birthPlace;
    private String birthdate;
    private Integer yearOfDraft;

    public HockeyPlayer() {
    }

    public HockeyPlayer(String id, String fullName, Integer height, Integer weight, String jerseyNumber, String birthPlace,
                        String birthdate, Integer yearOfDraft) {
        this.id = id;
        this.fullName = fullName;
        this.height = height;
        this.weight = weight;
        this.jerseyNumber = jerseyNumber;
        this.birthPlace = birthPlace;
        this.birthdate = birthdate;
        this.yearOfDraft = yearOfDraft;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public String getJerseyNumber() {
        return jerseyNumber;
    }

    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public Integer getYearOfDraft() {
        return yearOfDraft;
    }

    public void setYearOfDraft(Integer yearOfDraft) {
        this.yearOfDraft = yearOfDraft;
    }

    @Override
    public String toString() {
        return "HockeyPlayer{" +
                ", fullName='" + fullName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", jerseyNumber='" + jerseyNumber + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", yearOfDraft=" + yearOfDraft +
                '}';
    }
}

