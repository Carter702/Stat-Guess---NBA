package com.carter.khyri.statguess_nba.service.model;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class Players {

    @PrimaryKey
    @ColumnInfo(name = "player_id")
    private  String playerId;

    @ColumnInfo(name = "first_name")
    private String firstName;

    @ColumnInfo(name = "last_name")
    private String lastName;

    @ColumnInfo(name = "team_id")
    private String teamId;

    private String position;

    public Players(String playerId, String firstName, String lastName, String teamId, String position) {
        this.playerId = playerId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.teamId = teamId;
        this.position = position;
    }

    public String getPlayerId() {
        return playerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getTeamId() {
        return teamId;
    }

    public String getPosition() {
        return position;
    }
}
