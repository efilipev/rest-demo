package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "full_name",
        "first_name",
        "last_name",
        "abbr_name",
        "primary_position",
        "jersey_number",
        "birth_place"
})
public class Player {

    private String id;
    private String status;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("first_name")
    private String firstName;
    @JsonProperty("last_name")
    private String lastName;
    @JsonProperty("abbr_name")
    private String abbrName;
    private Integer height;
    private Integer weight;
    private String handedness;
    private String position;
    @JsonProperty("primary_position")
    private String primaryPosition;
    @JsonProperty("jersey_number")
    private String jerseyNumber;
    private String experience;
    @JsonProperty("birth_place")
    private String birthPlace;
    private String birthdate;
    private String updated;
    private Draft draft = new Draft();
    private String college;
    private List<Injury> injuries = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("full_name")
    public String getFullName() {
        return fullName;
    }

    @JsonProperty("full_name")
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @JsonProperty("first_name")
    public String getFirstName() {
        return firstName;
    }

    @JsonProperty("first_name")
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    @JsonProperty("last_name")
    public String getLastName() {
        return lastName;
    }

    @JsonProperty("last_name")
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    @JsonProperty("abbr_name")
    public String getAbbrName() {
        return abbrName;
    }

    @JsonProperty("abbr_name")
    public void setAbbrName(String abbrName) {
        this.abbrName = abbrName;
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

    public String getHandedness() {
        return handedness;
    }

    public void setHandedness(String handedness) {
        this.handedness = handedness;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @JsonProperty("primary_position")
    public String getPrimaryPosition() {
        return primaryPosition;
    }

    @JsonProperty("primary_position")
    public void setPrimaryPosition(String primaryPosition) {
        this.primaryPosition = primaryPosition;
    }

    @JsonProperty("jersey_number")
    public String getJerseyNumber() {
        return jerseyNumber;
    }

    @JsonProperty("jersey_number")
    public void setJerseyNumber(String jerseyNumber) {
        this.jerseyNumber = jerseyNumber;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @JsonProperty("birth_place")
    public String getBirthPlace() {
        return birthPlace;
    }

    @JsonProperty("birth_place")
    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(String birthdate) {
        this.birthdate = birthdate;
    }

    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    public Draft getDraft() {
        return draft;
    }

    public void setDraft(Draft draft) {
        this.draft = draft;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public List<Injury> getInjuries() {
        return injuries;
    }

    public void setInjuries(List<Injury> injuries) {
        this.injuries = injuries;
    }

    @Override
    public String toString() {
        return "Player{" +
                "id='" + id + '\'' +
                ", status='" + status + '\'' +
                ", fullName='" + fullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", abbrName='" + abbrName + '\'' +
                ", height=" + height +
                ", weight=" + weight +
                ", handedness='" + handedness + '\'' +
                ", position='" + position + '\'' +
                ", primaryPosition='" + primaryPosition + '\'' +
                ", jerseyNumber='" + jerseyNumber + '\'' +
                ", experience='" + experience + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", birthdate='" + birthdate + '\'' +
                ", updated='" + updated + '\'' +
                ", draft=" + draft +
                ", college='" + college + '\'' +
                ", injuries=" + injuries +
                '}';
    }
}

