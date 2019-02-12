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
    private static Player player;
    private static GameRepository gameRepo = new GameRepository();

    public static synchronized AppDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context.getApplicationContext(),
                    AppDatabase.class, "AppDatabase").fallbackToDestructiveMigration()
                    .addCallback(roomCallback)
                    .build();
        }
        return instance;
    }

    private static RoomDatabase.Callback roomCallback = new RoomDatabase.Callback() {
        @Override
        public void onCreate(@NonNull SupportSQLiteDatabase db) {
            super.onCreate(db);

//            gameRepo.getPlayers().observe(GlobalAppContext.getAppContext(), new Observer<Player>() {
//                @Override
//                public void onChanged(Player p) {
//                    player = p;
//                }
//            });

            new PopulateDbAsyncTask(instance).execute();
        }
    };

    private static class PopulateDbAsyncTask extends AsyncTask<Void, Void, Void> {
        private PlayerDao playerDao;
        private TeamDao teamDao;


        private PopulateDbAsyncTask(AppDatabase db) {
            playerDao = db.playerDao();
            teamDao = db.teamDao();
        }

        @Override
        protected Void doInBackground(Void... voids) {
            List<Player.Person> players = player.getLeague().getPeople();

            for (int i = 0; i < player.getLeague().getPeople().size(); i++) {
                Player.Person person = players.get(i);
                playerDao.insert(new Players(person.getPersonId(), person.getFirstName(), person.getLastName(), person.getTeamId(), person.getJersey()));
            }
            return null;
        }
    }
}
