package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "team_id",
})
public class Draft {

    @JsonProperty("team_id")
    private String teamId;
    private Integer year;
    private String round;
    private String pick;

    @JsonProperty("team_id")
    public String getTeamId() {
        return teamId;
    }

    @JsonProperty("team_id")
    public void setTeamId(String teamId) {
        this.teamId = teamId;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public String getRound() {
        return round;
    }

    public void setRound(String round) {
        this.round = round;
    }

    public String getPick() {
        return pick;
    }

    public void setPick(String pick) {
        this.pick = pick;
    }

    @Override
    public String toString() {
        return "Draft{" +
                "teamId='" + teamId + '\'' +
                ", year=" + year +
                ", round='" + round + '\'' +
                ", pick='" + pick + '\'' +
                '}';
    }
}

