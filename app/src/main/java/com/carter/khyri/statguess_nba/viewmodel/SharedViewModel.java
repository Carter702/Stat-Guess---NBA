package com.carter.khyri.statguess_nba.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.carter.khyri.statguess_nba.service.model.GameList;

import java.util.List;

public class SharedViewModel extends ViewModel {
    private final MutableLiveData<GameList.Game> game = new MutableLiveData<>();

    public void setGame(GameList.Game selected) {
        game.setValue(selected);
    }

    public LiveData<GameList.Game> getGame() {
        return game;
    }
}
