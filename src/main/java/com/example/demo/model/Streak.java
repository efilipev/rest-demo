package com.example.demo.model;

public class Streak {

    private String kind;
    private Integer length;

    public String getKind() {
        return kind;
    }

    public void setKind(String kind) {
        this.kind = kind;
    }

    public Integer getLength() {
        return length;
    }

    public void setLength(Integer length) {
        this.length = length;
    }

    @Override
    public String toString() {
        return "Streak{" +
                "kind='" + kind + '\'' +
                ", length=" + length +
                '}';
    }
}
