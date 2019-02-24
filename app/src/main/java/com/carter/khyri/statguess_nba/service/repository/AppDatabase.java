package com.carter.khyri.statguess_nba.service.repository;


import android.content.Context;
import android.os.AsyncTask;

import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.service.model.Teams;


import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;

@Database(entities = {Teams.class, Players.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {

    public abstract PlayerDao playerDao();

    private static AppDatabase mInstance;


    public static synchronized AppDatabase getDatabase(Context context) {
        if(mInstance == null) {
            mInstance = create(context.getApplicationContext());
        }
        return mInstance;
    }

    static AppDatabase create(Context context) {
        RoomDatabase.Builder<AppDatabase> builder = Room.databaseBuilder(
                context.getApplicationContext(), AppDatabase.class,
                "Players").fallbackToDestructiveMigration().addCallback(roomCallback);
        return builder.build();
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);
            new PopulateDbAsyncTask(mInstance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private PlayerDao playerDao;

        private PopulateDbAsyncTask(AppDatabase db) {
            playerDao = db.playerDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {

            return null;
        }
    }
}