package com.carter.khyri.statguess_nba.viewmodel;

import androidx.core.math.MathUtils;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;

public class GameListViewModel extends ViewModel {
    private GameRepository gameRepository;

    public GameListViewModel() {
        gameRepository = new GameRepository();
    }

    public MutableLiveData<GameList> getGames() {
        return gameRepository.getGameData();
    }

    public MutableLiveData<Player> getPlayers() {return gameRepository.getPlayers(); }
}
