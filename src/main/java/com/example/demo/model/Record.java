package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "record_type",
        "overtime_losses",
        "win_pct"
})
public class Record {

    @JsonProperty("record_type")
    private String recordType;
    private Integer wins;
    private Integer losses;
    @JsonProperty("overtime_losses")
    private Integer overtimeLosses;
    @JsonProperty("win_pct")
    private Double winPct;

    @JsonProperty("record_type")
    public String getRecordType() {
        return recordType;
    }

    @JsonProperty("record_type")
    public void setRecordType(String recordType) {
        this.recordType = recordType;
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

    @Override
    public String toString() {
        return "Record{" +
                "recordType='" + recordType + '\'' +
                ", wins=" + wins +
                ", losses=" + losses +
                ", overtimeLosses=" + overtimeLosses +
                ", winPct=" + winPct +
                '}';
    }
}

