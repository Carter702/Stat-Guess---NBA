package com.carter.khyri.statguess_nba.service.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Players {

    @SerializedName("league")
    @Expose
    private League league;

    public League getLeague() {
        return league;
    }

    public class League {

        @SerializedName("standard")
        @Expose
        private List<Standard> standard = null;

        public List<Standard> getStandard() {
            return standard;
        }

    }

    public class Standard {

        @SerializedName("firstName")
        @Expose
        private String firstName;
        @SerializedName("lastName")
        @Expose
        private String lastName;
        @SerializedName("personId")
        @Expose
        private String personId;
        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("jersey")
        @Expose
        private String jersey;
        @SerializedName("isActive")
        @Expose
        private boolean isActive;
        @SerializedName("pos")
        @Expose
        private String pos;
        @SerializedName("heightFeet")
        @Expose
        private String heightFeet;
        @SerializedName("heightInches")
        @Expose
        private String heightInches;
        @SerializedName("heightMeters")
        @Expose
        private String heightMeters;
        @SerializedName("weightPounds")
        @Expose
        private String weightPounds;
        @SerializedName("weightKilograms")
        @Expose
        private String weightKilograms;
        @SerializedName("dateOfBirthUTC")
        @Expose
        private String dateOfBirthUTC;
        @SerializedName("teams")
        @Expose
        private List<Team> teams = null;
        @SerializedName("nbaDebutYear")
        @Expose
        private String nbaDebutYear;
        @SerializedName("yearsPro")
        @Expose
        private String yearsPro;
        @SerializedName("collegeName")
        @Expose
        private String collegeName;
        @SerializedName("lastAffiliation")
        @Expose
        private String lastAffiliation;
        @SerializedName("country")
        @Expose
        private String country;

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

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public String getJersey() {
            return jersey;
        }

        public void setJersey(String jersey) {
            this.jersey = jersey;
        }

        public boolean isIsActive() {
            return isActive;
        }

        public void setIsActive(boolean isActive) {
            this.isActive = isActive;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public String getHeightFeet() {
            return heightFeet;
        }

        public void setHeightFeet(String heightFeet) {
            this.heightFeet = heightFeet;
        }

        public String getHeightInches() {
            return heightInches;
        }

        public void setHeightInches(String heightInches) {
            this.heightInches = heightInches;
        }

        public String getHeightMeters() {
            return heightMeters;
        }

        public void setHeightMeters(String heightMeters) {
            this.heightMeters = heightMeters;
        }

        public String getWeightPounds() {
            return weightPounds;
        }

        public void setWeightPounds(String weightPounds) {
            this.weightPounds = weightPounds;
        }

        public String getWeightKilograms() {
            return weightKilograms;
        }

        public void setWeightKilograms(String weightKilograms) {
            this.weightKilograms = weightKilograms;
        }

        public String getDateOfBirthUTC() {
            return dateOfBirthUTC;
        }

        public void setDateOfBirthUTC(String dateOfBirthUTC) {
            this.dateOfBirthUTC = dateOfBirthUTC;
        }

        public List<Team> getTeams() {
            return teams;
        }

        public void setTeams(List<Team> teams) {
            this.teams = teams;
        }

        public String getNbaDebutYear() {
            return nbaDebutYear;
        }

        public void setNbaDebutYear(String nbaDebutYear) {
            this.nbaDebutYear = nbaDebutYear;
        }

        public String getYearsPro() {
            return yearsPro;
        }

        public void setYearsPro(String yearsPro) {
            this.yearsPro = yearsPro;
        }

        public String getCollegeName() {
            return collegeName;
        }

        public void setCollegeName(String collegeName) {
            this.collegeName = collegeName;
        }

        public String getLastAffiliation() {
            return lastAffiliation;
        }

        public void setLastAffiliation(String lastAffiliation) {
            this.lastAffiliation = lastAffiliation;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    }

    public class Team {

        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("seasonStart")
        @Expose
        private String seasonStart;
        @SerializedName("seasonEnd")
        @Expose
        private String seasonEnd;

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

    }

}
