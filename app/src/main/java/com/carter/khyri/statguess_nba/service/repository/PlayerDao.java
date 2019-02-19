package com.carter.khyri.statguess_nba.service.repository;

import android.os.AsyncTask;

import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.model.Players;

import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

@Dao
public interface PlayerDao {

    @Insert
    void insert(Players player);

    @Update
    void update(Players player);

    @Delete
    void delete(Players player);

    @Query("DELETE FROM Players")
    void deleteAllPlayers();

    @Query("SELECT * FROM Players ORDER BY team_id DESC")
    LiveData<List<Players>> getAllPlayers();

    @Query("SELECT * FROM Players WHERE team_id = :teamId ORDER BY position DESC")
    LiveData<List<Players>> getTeamPlayers(String teamId);

}
