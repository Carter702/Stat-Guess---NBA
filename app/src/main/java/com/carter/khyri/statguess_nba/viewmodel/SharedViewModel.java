package com.carter.khyri.statguess_nba.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameInfo;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<GameInfo.Game> game = new MutableLiveData<>();

    public void setGame(GameInfo.Game selected) {
        game.setValue(selected);
    }

    public LiveData<GameInfo.Game> getGame() {
        return game;
    }
}
