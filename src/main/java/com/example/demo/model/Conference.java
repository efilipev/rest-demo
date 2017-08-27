package com.example.demo.model;

import java.util.List;


public class Conference {

    private String id;
    private String name;
    private String alias;
    private List<SeasonStatisticsDivision> divisions = null;

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

    public List<SeasonStatisticsDivision> getDivisions() {
        return divisions;
    }

    public void setDivisions(List<SeasonStatisticsDivision> divisions) {
        this.divisions = divisions;
    }

    @Override
    public String toString() {
        return "Conference{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", alias='" + alias + '\'' +
                ", divisions=" + divisions +
                '}';
    }
}

