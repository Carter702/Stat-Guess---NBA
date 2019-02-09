package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.Team;

import androidx.room.Database;
import androidx.room.RoomDatabase;

@Database(entities = {Team.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    //public abstract TeamDao teamDao();
}
