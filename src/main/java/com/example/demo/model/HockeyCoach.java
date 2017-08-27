package com.example.demo.model;

public class HockeyCoach {

    private String fullName;
    private String firstName;
    private String lastName;
    private String position;
    private String experience;

    public HockeyCoach() {
    }

    public HockeyCoach(String fullName, String firstName, String lastName, String position, String experience) {
        this.fullName = fullName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.position = position;
        this.experience = experience;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    @Override
    public String toString() {
        return "HockeyCoach{" +
                ", fullName='" + fullName + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", position='" + position + '\'' +
                ", experience='" + experience + '\'' +
                '}';
    }
}

