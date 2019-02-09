package com.carter.khyri.statguess_nba.service.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Team {
    @PrimaryKey
    public String teamID;

    @ColumnInfo(name = "team_name")
    public String teamName;

    @ColumnInfo(name = "team_id")
    public String getTeamID;

    @ColumnInfo(name = "tri_code")
    public String triCode;

}
