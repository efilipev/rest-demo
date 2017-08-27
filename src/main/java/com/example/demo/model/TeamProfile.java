package com.example.demo.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document
public class TeamProfile {

    @Id
    private String id;
    private String marketName;
    private String teamName;
    private String venueName;
    private Integer capacity;
    private String city;
    private String country;
    private String leagueName;
    private String conference;
    private String division;
    @DBRef
    private List<HockeyPlayer> playerModel;

    public TeamProfile() {
    }

    public TeamProfile(String marketName, String teamName, String venueName, Integer capacity, String city, String country, String leagueName,
                       String conference, String division, List<HockeyPlayer> playerModel) {
        this.marketName = marketName;
        this.teamName = teamName;
        this.venueName = venueName;
        this.capacity = capacity;
        this.city = city;
        this.country = country;
        this.leagueName = leagueName;
        this.conference = conference;
        this.division = division;
        this.playerModel = playerModel;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getMarketName() {
        return marketName;
    }

    public void setMarketName(String marketName) {
        this.marketName = marketName;
    }

    public String getTeamNAme() {
        return teamName;
    }

    public void setTeamNAme(String teamNAme) {
        this.teamName = teamNAme;
    }

    public String getVenueName() {
        return venueName;
    }

    public void setVenueName(String venueName) {
        this.venueName = venueName;
    }

    public Integer getCapacity() {
        return capacity;
    }

    public void setCapacity(Integer capacity) {
        this.capacity = capacity;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getLeagueName() {
        return leagueName;
    }

    public void setLeagueName(String leagueName) {
        this.leagueName = leagueName;
    }

    public String getConference() {
        return conference;
    }

    public void setConference(String conference) {
        this.conference = conference;
    }

    public String getDivision() {
        return division;
    }

    public void setDivision(String division) {
        this.division = division;
    }

    public List<HockeyPlayer> getPlayerModel() {
        return playerModel;
    }

    public void setPlayerModel(List<HockeyPlayer> playerModel) {
        this.playerModel = playerModel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof TeamProfile)) return false;

        TeamProfile that = (TeamProfile) o;

        if (id != null ? !id.equals(that.id) : that.id != null) return false;
        if (marketName != null ? !marketName.equals(that.marketName) : that.marketName != null) return false;
        if (teamName != null ? !teamName.equals(that.teamName) : that.teamName != null) return false;
        if (venueName != null ? !venueName.equals(that.venueName) : that.venueName != null) return false;
        if (capacity != null ? !capacity.equals(that.capacity) : that.capacity != null) return false;
        if (city != null ? !city.equals(that.city) : that.city != null) return false;
        if (country != null ? !country.equals(that.country) : that.country != null) return false;
        if (leagueName != null ? !leagueName.equals(that.leagueName) : that.leagueName != null) return false;
        if (conference != null ? !conference.equals(that.conference) : that.conference != null) return false;
        if (division != null ? !division.equals(that.division) : that.division != null) return false;
        return playerModel != null ? playerModel.equals(that.playerModel) : that.playerModel == null;

    }

    @Override
    public int hashCode() {
        int result = id != null ? id.hashCode() : 0;
        result = 31 * result + (marketName != null ? marketName.hashCode() : 0);
        result = 31 * result + (teamName != null ? teamName.hashCode() : 0);
        result = 31 * result + (venueName != null ? venueName.hashCode() : 0);
        result = 31 * result + (capacity != null ? capacity.hashCode() : 0);
        result = 31 * result + (city != null ? city.hashCode() : 0);
        result = 31 * result + (country != null ? country.hashCode() : 0);
        result = 31 * result + (leagueName != null ? leagueName.hashCode() : 0);
        result = 31 * result + (conference != null ? conference.hashCode() : 0);
        result = 31 * result + (division != null ? division.hashCode() : 0);
        result = 31 * result + (playerModel != null ? playerModel.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "TeamProfile{" +
                "id='" + id + '\'' +
                ", marketName='" + marketName + '\'' +
                ", teamNAme='" + teamName + '\'' +
                ", venueName='" + venueName + '\'' +
                ", capacity=" + capacity +
                ", city='" + city + '\'' +
                ", country='" + country + '\'' +
                ", leagueName='" + leagueName + '\'' +
                ", conference='" + conference + '\'' +
                ", division='" + division + '\'' +
                ", playerModel=" + playerModel +
                '}';
    }
}

