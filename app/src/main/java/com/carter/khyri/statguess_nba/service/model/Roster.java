package com.carter.khyri.statguess_nba.service.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class Roster {

    @SerializedName("league")
    @Expose
    private League league;

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {  this.league = league; }

    public class League {

        @SerializedName("standard")
        @Expose
        private Standard standard;

        public Standard getStandard() {
            return standard;
        }

    }

    public class Player {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

    }

    public class Standard {

        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("players")
        @Expose
        private List<Player> players = null;

        public String getTeamId() {
            return teamId;
        }

        public List<Player> getPlayers() {
            return players;
        }

    }

}




