package com.carter.khyri.statguess_nba.service.repository;

import android.app.Application;
import android.os.AsyncTask;

import com.carter.khyri.statguess_nba.service.model.Players;

import java.util.List;

import androidx.lifecycle.LiveData;

public class PlayerRepository {
    private PlayerDao playerDao;
    private LiveData<List<Players>> allPlayers;

    public PlayerRepository(Application application) {
        AppDatabase database = AppDatabase.getDatabase(application);
        playerDao = database.playerDao();
        allPlayers = playerDao.getAllPlayers();
    }

    public void insert(Players players) {
        new InsertPlayerAsynctask(playerDao).execute(players);
    }

    public void update(Players players) {
        new UpdatePlayerAsynctask(playerDao).execute(players);
    }

    public void delete(Players players) {
        new DeletePlayerAsynctask(playerDao).execute(players);
    }

    public void deleteAllPlayers() {
        new DeleteAllPlayerAsynctask(playerDao).execute();
    }

    public LiveData<List<Players>> getAllPlayers() {
        return allPlayers;
    }

    private static class InsertPlayerAsynctask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private InsertPlayerAsynctask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.insert(players[0]);
            return null;
        }
    }

    private static class UpdatePlayerAsynctask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private UpdatePlayerAsynctask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.update(players[0]);
            return null;
        }
    }

    private static class DeletePlayerAsynctask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private DeletePlayerAsynctask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.delete(players[0]);
            return null;
        }
    }

    private static class DeleteAllPlayerAsynctask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private DeleteAllPlayerAsynctask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.deleteAllPlayers();
            return null;
        }
    }
}
