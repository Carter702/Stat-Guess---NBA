package com.carter.khyri.statguess_nba.service.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Teams {
    @PrimaryKey
    @ColumnInfo(name = "team_id")
    public String teamId;

    @ColumnInfo(name = "team_name")
    public String teamName;

    @ColumnInfo(name = "tri_code")
    public String triCode;

    public String city;
}
