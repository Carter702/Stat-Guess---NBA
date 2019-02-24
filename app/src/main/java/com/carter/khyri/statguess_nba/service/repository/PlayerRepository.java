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

    public void insert(Players player) {
        new InsertPlayerAsyncTask(playerDao).execute(player);
    }

    public void update(Players players) {
        new UpdatePlayerAsyncTask(playerDao).execute(players);
    }

    public void delete(Players players) {
        new DeletePlayerAsyncTask(playerDao).execute(players);
    }

    public void deleteAllPlayers() {
        new DeleteAllPlayerAsyncTask(playerDao).execute();
    }

    public LiveData<List<Players>> getAllPlayers() {
        return allPlayers;
    }

    private static class InsertPlayerAsyncTask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private InsertPlayerAsyncTask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.insert(players[0]);
            return null;
        }
    }

    private static class UpdatePlayerAsyncTask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private UpdatePlayerAsyncTask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.update(players[0]);
            return null;
        }
    }

    private static class DeletePlayerAsyncTask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private DeletePlayerAsyncTask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.delete(players[0]);
            return null;
        }
    }

    private static class DeleteAllPlayerAsyncTask extends AsyncTask<Players, Void, Void> {
        private PlayerDao playerDao;

        private DeleteAllPlayerAsyncTask(PlayerDao playerDao) {
            this.playerDao = playerDao;
        }

        @Override
        protected Void doInBackground(Players... players) {
            playerDao.deleteAllPlayers();
            return null;
        }
    }
}
