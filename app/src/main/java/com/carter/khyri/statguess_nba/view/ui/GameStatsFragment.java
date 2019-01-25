package com.carter.khyri.statguess_nba.view.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.viewmodel.GameStatsViewModel;

public class GameStatsFragment extends Fragment {

    private GameStatsViewModel mViewModel;
    GameStat gameStat = new GameStat();
    private String gameId;
    final static String TAG = "DEBUG";

    public static GameStatsFragment newInstance() { return new GameStatsFragment();  }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_stats_fragment, container, false);

        mViewModel = ViewModelProviders.of(this).get(GameStatsViewModel.class);
        mViewModel.getGameStats(gameId).observe(this, new Observer<GameStat>() {
            @Override
            public void onChanged(@Nullable GameStat game) {
                gameStat = game;
            }
        });

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    public void setGameID(String id) {
        this.gameId = id;
    }

}
