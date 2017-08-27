package com.example.demo.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "start_date",
        "update_date"
})
public class Injury {

    private String id;
    private String comment;
    private String desc;
    private String status;
    @JsonProperty("start_date")
    private String startDate;
    @JsonProperty("update_date")
    private String updateDate;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @JsonProperty("start_date")
    public String getStartDate() {
        return startDate;
    }

    @JsonProperty("start_date")
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    @JsonProperty("update_date")
    public String getUpdateDate() {
        return updateDate;
    }

    @JsonProperty("update_date")
    public void setUpdateDate(String updateDate) {
        this.updateDate = updateDate;
    }

    @Override
    public String toString() {
        return "Injury{" +
                "id='" + id + '\'' +
                ", comment='" + comment + '\'' +
                ", desc='" + desc + '\'' +
                ", status='" + status + '\'' +
                ", startDate='" + startDate + '\'' +
                ", updateDate='" + updateDate + '\'' +
                '}';
    }
}

