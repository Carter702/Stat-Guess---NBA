package com.carter.khyri.statguess_nba.service.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Player {

    @SerializedName("league")
    @Expose
    private League league;

    public League getLeague() {
        return league;
    }

    public class League {

        @SerializedName("standard")
        @Expose
        private List<Person> standard = null;

        public List<Person> getPeople() {
            return standard;
        }

    }

    public class Person {

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

        public String getFirstName() {
            return firstName;
        }

        public String getLastName() {
            return lastName;
        }

        public String getPersonId() {
            return personId;
        }

        public String getTeamId() {
            return teamId;
        }

        public String getJersey() {
            return jersey;
        }

        public boolean isIsActive() {
            return isActive;
        }

        public String getPos() {
            return pos;
        }

    }

}
