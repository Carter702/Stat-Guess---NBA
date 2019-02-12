package com.carter.khyri.statguess_nba.viewmodel;

import android.app.Application;
import android.content.Context;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;
import com.carter.khyri.statguess_nba.service.utils.GlobalAppContext;

public class GameInfoViewModel extends ViewModel {
    private GameRepository gameRepository;

    public GameInfoViewModel() {
        gameRepository = new GameRepository();
    }

    public MutableLiveData<GameInfo> getGames() {
        return gameRepository.getGameData();
    }

}
