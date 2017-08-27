package com.example.demo.model;

public class Rank {

    private Integer conference;
    private Integer division;

    public Integer getConference() {
        return conference;
    }

    public void setConference(Integer conference) {
        this.conference = conference;
    }

    public Integer getDivision() {
        return division;
    }

    public void setDivision(Integer division) {
        this.division = division;
    }

    @Override
    public String toString() {
        return "Rank{" +
                "conference=" + conference +
                ", division=" + division +
                '}';
    }
}
