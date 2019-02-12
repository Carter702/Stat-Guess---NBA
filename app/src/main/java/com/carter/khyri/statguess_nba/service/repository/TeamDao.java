package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.Team;
import com.carter.khyri.statguess_nba.service.model.Teams;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface TeamDao {

    @Insert
    void insert(Teams team);

    @Update
    void update(Teams team);

    @Delete
    void delete(Teams team);

    @Query("SELECT * FROM Teams")
    LiveData<List<Teams>> getTeams();

    @Query("SELECT * FROM Teams WHERE team_id = :teamId")
    Teams getTeam(String teamId);
}
