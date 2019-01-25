package com.carter.khyri.statguess_nba.viewmodel;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.arch.lifecycle.ViewModel;

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
