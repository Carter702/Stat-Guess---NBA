package com.carter.khyri.statguess_nba.viewmodel;

import android.app.Application;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;
import com.carter.khyri.statguess_nba.service.utils.GlobalAppContext;

public class GameStatsViewModel extends ViewModel {
    private GameRepository gameRepository;

    public GameStatsViewModel() {
        gameRepository = new GameRepository();
    }

    public MutableLiveData<GameStat> getGameStats(String id) {
        return gameRepository.getGameStats(id);
    }

}
