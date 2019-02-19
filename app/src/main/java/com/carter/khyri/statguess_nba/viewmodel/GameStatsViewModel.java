package com.carter.khyri.statguess_nba.viewmodel;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;

public class GameStatsViewModel extends ViewModel {
    private GameRepository gameRepository;

    public GameStatsViewModel() {
        gameRepository = new GameRepository();
    }

    public MutableLiveData<GameStat> getGameStats(String id) {
        return gameRepository.getGameStats(id);
    }

}
