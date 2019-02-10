package com.carter.khyri.statguess_nba.service.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Players {

    @PrimaryKey
    @ColumnInfo(name = "player_id")
    public  String playerId;

    @ColumnInfo(name = "first_name")
    public String firstName;

    @ColumnInfo(name = "last_name")
    public String lastName;

    @ColumnInfo(name = "team_id")
    public String teamId;

    public String position;
}
