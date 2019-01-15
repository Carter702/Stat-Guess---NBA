package com.carter.khyri.statguess_nba.viewmodel;

import android.app.Application;
import android.arch.lifecycle.AndroidViewModel;
import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;
import android.icu.text.SimpleDateFormat;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;

import java.util.Calendar;
import java.util.Date;

public class GameInfoViewModel extends ViewModel {
    private GameRepository gameRepository;

    public GameInfoViewModel() {
        gameRepository = new GameRepository();
    }

    public MutableLiveData<GameInfo> getGames() {
        return gameRepository.getGameData();
    }

}
