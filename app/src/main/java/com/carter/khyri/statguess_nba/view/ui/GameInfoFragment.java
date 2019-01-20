package com.carter.khyri.statguess_nba.view.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.view.adapter.GameInfoAdapter;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.viewmodel.GameInfoViewModel;


public class GameInfoFragment extends Fragment {
    GameInfoViewModel mViewModel;
    GameInfo games = new GameInfo();
    RecyclerView mRecyclerView;
    GameInfoAdapter mGameInfoAdapter;

    public GameInfoFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.game_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        mRecyclerView.setItemAnimator(new DefaultItemAnimator());
        mRecyclerView.setAdapter(mGameInfoAdapter);

        mViewModel = ViewModelProviders.of(this).get(GameInfoViewModel.class);
        mViewModel.getGames().observe(this, new Observer<GameInfo>() {
            @Override
            public void onChanged(@Nullable GameInfo game) {
                mGameInfoAdapter = new GameInfoAdapter(game);
                mRecyclerView.setAdapter(mGameInfoAdapter);
                games = game;
            }
        });

        return view;
    }

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden == false){
            mViewModel.getGames().observe(this, new Observer<GameInfo>() {
                @Override
                public void onChanged(@Nullable GameInfo game) {
                    mGameInfoAdapter = new GameInfoAdapter(game);
                    mRecyclerView.setAdapter(mGameInfoAdapter);
                    games = game;
                }
            });
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

}
