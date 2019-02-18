package com.carter.khyri.statguess_nba.service.repository;


import android.content.Context;

import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.service.model.Teams;


import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Teams.class, Players.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    private static AppDatabase sInstance;
    public abstract TeamDao teamDao();
    public abstract PlayerDao playerDao();

    public static synchronized AppDatabase getDatabase(Context context) {
        if(sInstance == null) {
            sInstance = create(context);
        }
        return sInstance;
    }

    static AppDatabase create(Context context) {
        RoomDatabase.Builder<AppDatabase> builder = Room.databaseBuilder(
                context.getApplicationContext(), AppDatabase.class,
                "Players");
        return builder.build();
    }
}