package com.example.demo.model;

import java.util.List;

public class SeasonStatisticsDivision {

    private String id;
    private String name;
    private String alias;
    private List<SeasonTeamStatistics> teams = null;

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

    public List<SeasonTeamStatistics> getTeams() {
        return teams;
    }

    public void setTeams(List<SeasonTeamStatistics> teams) {
        this.teams = teams;
    }

    @Override
    public String toString() {
        return "SeasonStatisticsDivision{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", teams=" + teams +
                '}';
    }
}


