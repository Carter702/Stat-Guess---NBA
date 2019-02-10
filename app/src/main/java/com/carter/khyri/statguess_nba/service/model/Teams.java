package com.carter.khyri.statguess_nba.service.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Teams {

    @PrimaryKey
    @ColumnInfo(name = "team_id")
    private String teamId;

    @ColumnInfo(name = "team_name")
    private String teamName;

    @ColumnInfo(name = "tri_code")
    private String triCode;

    private String city;

    public Teams(String teamId, String teamName, String triCode, String city) {
        this.teamId = teamId;
        this.teamName = teamName;
        this.triCode = triCode;
        this.city = city;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getTeamName() {
        return teamName;
    }

    public String getTriCode() {
        return triCode;
    }

    public String getCity() {
        return city;
    }
}
