package com.carter.khyri.statguess_nba.viewmodel;

import android.app.Application;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.service.repository.AppDatabase;
import com.carter.khyri.statguess_nba.service.repository.PlayerDao;
import com.carter.khyri.statguess_nba.service.repository.PlayerRepository;

import java.util.List;

public class SharedViewModel extends ViewModel {

    private LiveData<List<Players>> players;
    private PlayerDao playerDao;
    private PlayerRepository playerRepository;
    private final MutableLiveData<GameList.Game> game = new MutableLiveData<>();


    public SharedViewModel() {
        //super(application);

//        playerRepository = new PlayerRepository(application);
//        playerDao = AppDatabase.getDatabase(this.getApplication().getApplicationContext()).playerDao();
//        players = playerDao.getAllPlayers();
    }

    public void setGame(GameList.Game selected) {
        game.setValue(selected);
    }

    public LiveData<List<Players>> getPlayers() {
        return players;
    }

    public LiveData<GameList.Game> getGame() {
        return game;
    }

    public void insertAll(List<Player.Person> player) {
        for (Player.Person person : player) {
            playerRepository.insert(new Players(person.getPersonId(), person.getFirstName(), person.getLastName(), person.getTeamId(), person.getPos()));
        }
    }
}
