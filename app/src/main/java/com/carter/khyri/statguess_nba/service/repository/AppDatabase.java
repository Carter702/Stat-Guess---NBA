package com.carter.khyri.statguess_nba.service.repository;

import android.app.Application;
import android.content.Context;
import android.os.AsyncTask;

import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.service.model.Teams;
import com.carter.khyri.statguess_nba.service.utils.GlobalAppContext;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.Observer;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Teams.class, Players.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase instance;

    public abstract TeamDao teamDao();

    public abstract PlayerDao playerDao();

}