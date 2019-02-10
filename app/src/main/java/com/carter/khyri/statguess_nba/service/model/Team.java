package com.carter.khyri.statguess_nba.service.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class Team {
    @SerializedName("league")
    @Expose
    private League league;

    public League getLeague() {
        return league;
    }

    public class League {

        @SerializedName("standard")
        @Expose
        private List<Organization> standard = null;

        public List<Organization> getStandard() {
            return standard;
        }

    }

    public class Organization {

        @SerializedName("isNBAFranchise")
        @Expose
        private boolean isNBAFranchise;
        @SerializedName("isAllStar")
        @Expose
        private boolean isAllStar;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("fullName")
        @Expose
        private String fullName;
        @SerializedName("tricode")
        @Expose
        private String tricode;
        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("nickname")
        @Expose
        private String nickname;
        @SerializedName("urlName")
        @Expose
        private String urlName;
        @SerializedName("confName")
        @Expose
        private String confName;
        @SerializedName("divName")
        @Expose
        private String divName;

        public boolean isIsNBAFranchise() {
            return isNBAFranchise;
        }

        public boolean isIsAllStar() {
            return isAllStar;
        }

        public void setIsAllStar(boolean isAllStar) {
            this.isAllStar = isAllStar;
        }

        public String getCity() {
            return city;
        }

        public String getFullName() {
            return fullName;
        }

        public String getTricode() {
            return tricode;
        }

        public String getTeamId() {
            return teamId;
        }

        public String getNickname() {
            return nickname;
        }

        public String getUrlName() {
            return urlName;
        }

        public String getConfName() {
            return confName;
        }

        public String getDivName() {
            return divName;
        }

    }

}
