package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.List;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "games_played",
        "overtime_losses",
        "win_pct",
        "regulation_wins",
        "shootout_wins",
        "shootout_losses",
        "goals_for",
        "goals_against",
        "goal_diff",
        "powerplay_goals",
        "powerplay_pct",
        "powerplays_against",
        "powerplay_goals_against",
        "penalty_killing_pct"

})
public class SeasonTeamStatistics {

    private String id;
    private String name;
    private String market;
    @JsonProperty("games_played")
    private Integer gamesPlayed;
    private Integer wins;
    private Integer losses;
    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;
    @JsonProperty("win_pct")
    private Double winPct;
    private Integer points;
    @JsonProperty("regulation_wins")
    private Integer regulationWins;
    @JsonProperty("shootout_wins")
    private Integer shootoutWins;
    @JsonProperty("shootout_losses")
    private Integer shootoutLosses;
    @JsonProperty("goals_for")
    private Integer goalsFor;
    @JsonProperty("goals_against")
    private Integer goalsAgainst;
    @JsonProperty("goal_diff")
    private Integer goalDiff;
    private Integer powerplays;
    @JsonProperty("powerplay_goals")
    private Integer powerplayGoals;
    @JsonProperty("powerplay_pct")
    private Double powerplayPct;
    @JsonProperty("powerplays_against")
    private Integer powerplaysAgainst;
    @JsonProperty("powerplay_goals_against")
    private Integer powerplayGoalsAgainst;
    @JsonProperty("penalty_killing_pct")
    private Double penaltyKillingPct;
    private Streak streak;
    private List<Record> records = null;

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

    public String getMarket() {
        return market;
    }

    public void setMarket(String market) {
        this.market = market;
    }

    @JsonProperty("games_played")
    public Integer getGamesPlayed() {
        return gamesPlayed;
    }

    @JsonProperty("games_played")
    public void setGamesPlayed(Integer gamesPlayed) {
        this.gamesPlayed = gamesPlayed;
    }

    public Integer getWins() {
        return wins;
    }

    public void setWins(Integer wins) {
        this.wins = wins;
    }

    public Integer getLosses() {
        return losses;
    }

    public void setLosses(Integer losses) {
        this.losses = losses;
    }

    @JsonProperty("overtime_losses")
    public Integer getOvertimeLosses() {
        return overtimeLosses;
    }

    @JsonProperty("overtime_losses")
    public void setOvertimeLosses(Integer overtimeLosses) {
        this.overtimeLosses = overtimeLosses;
    }

    @JsonProperty("win_pct")
    public Double getWinPct() {
        return winPct;
    }

    @JsonProperty("win_pct")
    public void setWinPct(Double winPct) {
        this.winPct = winPct;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    @JsonProperty("regulation_wins")
    public Integer getRegulationWins() {
        return regulationWins;
    }

    @JsonProperty("regulation_wins")
    public void setRegulationWins(Integer regulationWins) {
        this.regulationWins = regulationWins;
    }

    @JsonProperty("shootout_wins")
    public Integer getShootoutWins() {
        return shootoutWins;
    }

    @JsonProperty("shootout_wins")
    public void setShootoutWins(Integer shootoutWins) {
        this.shootoutWins = shootoutWins;
    }

    @JsonProperty("shootout_losses")
    public Integer getShootoutLosses() {
        return shootoutLosses;
    }

    @JsonProperty("shootout_losses")
    public void setShootoutLosses(Integer shootoutLosses) {
        this.shootoutLosses = shootoutLosses;
    }

    @JsonProperty("goals_for")
    public Integer getGoalsFor() {
        return goalsFor;
    }

    @JsonProperty("goals_for")
    public void setGoalsFor(Integer goalsFor) {
        this.goalsFor = goalsFor;
    }

    @JsonProperty("goals_against")
    public Integer getGoalsAgainst() {
        return goalsAgainst;
    }

    @JsonProperty("goals_against")
    public void setGoalsAgainst(Integer goalsAgainst) {
        this.goalsAgainst = goalsAgainst;
    }

    @JsonProperty("goal_diff")
    public Integer getGoalDiff() {
        return goalDiff;
    }

    @JsonProperty("goal_diff")
    public void setGoalDiff(Integer goalDiff) {
        this.goalDiff = goalDiff;
    }

    public Integer getPowerplays() {
        return powerplays;
    }

    public void setPowerplays(Integer powerplays) {
        this.powerplays = powerplays;
    }

    @JsonProperty("powerplay_goals")
    public Integer getPowerplayGoals() {
        return powerplayGoals;
    }

    @JsonProperty("powerplay_goals")
    public void setPowerplayGoals(Integer powerplayGoals) {
        this.powerplayGoals = powerplayGoals;
    }

    @JsonProperty("powerplay_pct")
    public Double getPowerplayPct() {
        return powerplayPct;
    }

    @JsonProperty("powerplay_pct")
    public void setPowerplayPct(Double powerplayPct) {
        this.powerplayPct = powerplayPct;
    }

    @JsonProperty("powerplays_against")
    public Integer getPowerplaysAgainst() {
        return powerplaysAgainst;
    }

    @JsonProperty("powerplays_against")
    public void setPowerplaysAgainst(Integer powerplaysAgainst) {
        this.powerplaysAgainst = powerplaysAgainst;
    }

    @JsonProperty("powerplay_goals_against")
    public Integer getPowerplayGoalsAgainst() {
        return powerplayGoalsAgainst;
    }

    @JsonProperty("powerplay_goals_against")
    public void setPowerplayGoalsAgainst(Integer powerplayGoalsAgainst) {
        this.powerplayGoalsAgainst = powerplayGoalsAgainst;
    }

    @JsonProperty("penalty_killing_pct")
    public Double getPenaltyKillingPct() {
        return penaltyKillingPct;
    }

    @JsonProperty("penalty_killing_pct")
    public void setPenaltyKillingPct(Double penaltyKillingPct) {
        this.penaltyKillingPct = penaltyKillingPct;
    }

    public Streak getStreak() {
        return streak;
    }

    public void setStreak(Streak streak) {
        this.streak = streak;
    }

    public List<Record> getRecords() {
        return records;
    }

    public void setRecords(List<Record> records) {
        this.records = records;
    }

    @Override
    public String toString() {
        return "SeasonTeamStatisticsDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", market='" + market + '\'' +
                ", gamesPlayed=" + gamesPlayed +
                ", wins=" + wins +
                ", losses=" + losses +
                ", overtimeLosses=" + overtimeLosses +
                ", winPct=" + winPct +
                ", points=" + points +
                ", regulationWins=" + regulationWins +
                ", shootoutWins=" + shootoutWins +
                ", shootoutLosses=" + shootoutLosses +
                ", goalsFor=" + goalsFor +
                ", goalsAgainst=" + goalsAgainst +
                ", goalDiff=" + goalDiff +
                ", powerplays=" + powerplays +
                ", powerplayGoals=" + powerplayGoals +
                ", powerplayPct=" + powerplayPct +
                ", powerplaysAgainst=" + powerplaysAgainst +
                ", powerplayGoalsAgainst=" + powerplayGoalsAgainst +
                ", penaltyKillingPct=" + penaltyKillingPct +
                ", streak=" + streak +
                ", records=" + records +
                '}';
    }
}

