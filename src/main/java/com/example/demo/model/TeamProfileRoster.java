package com.example.demo.model;

import java.util.List;

public class TeamProfileRoster {

    private String id;
    private String name;
    private String alias;
    private String market;
    private Venue venue;
    private League league;
    private Conference conference;
    private Division division;
    private List<Coach> coaches = null;
    private List<Player> players = null;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    public Venue getVenue() {
        return venue;
    }

    public void setVenue(Venue venue) {
        this.venue = venue;
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }

    public Conference getConference() {
        return conference;
    }

    public void setConference(Conference conference) {
        this.conference = conference;
    }

    public Division getDivision() {
        return division;
    }

    public void setDivision(Division division) {
        this.division = division;
    }

    public List<Coach> getCoaches() {
        return coaches;
    }

    public void setCoaches(List<Coach> coaches) {
        this.coaches = coaches;
    }

    public List<Player> getPlayers() {
        return players;
    }

    public void setPlayers(List<Player> players) {
        this.players = players;
    }

    @Override
    public String toString() {
        return "TeamProfileRoster{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", market='" + market + '\'' +
                ", venue=" + venue +
                ", league=" + league +
                ", conference=" + conference +
                ", division=" + division +
                ", coaches=" + coaches +
                ", players=" + players +
                '}';
    }
}


