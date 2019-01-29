package com.carter.khyri.statguess_nba.view.ui;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.view.adapter.GameInfoAdapter;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.viewmodel.GameInfoViewModel;


public class GameInfoFragment extends Fragment{
    GameInfoViewModel mViewModel;
    GameInfo games;
    RecyclerView mRecyclerView;
    GameInfoAdapter mGameInfoAdapter;


    public GameInfoFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        games = new GameInfo();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.game_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mViewModel = ViewModelProviders.of(this).get(GameInfoViewModel.class);
        mViewModel.getGames().observe(this, new Observer<GameInfo>() {
            @Override
            public void onChanged(@Nullable GameInfo game) {
                mGameInfoAdapter = new GameInfoAdapter(game, listener, getContext());
                mRecyclerView.setAdapter(mGameInfoAdapter);
                games = game;
            }
        });

        return view;
    }

    GameInfoAdapter.ClickListener listener = new GameInfoAdapter.ClickListener() {
        @Override
        public void onItemClicked(GameInfo.Game game) {
            GameStatsFragment gameStat = new GameStatsFragment();
            gameStat.setGameInfo(game.getGameId(), game.getHTeam().getTriCode(), game.getVTeam().getTriCode());
            getChildFragmentManager().beginTransaction().replace(R.id.game_info_container, gameStat).addToBackStack(null).commit();
        }
    };

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (hidden == false){
            mViewModel.getGames().observe(this, new Observer<GameInfo>() {
                @Override
                public void onChanged(@Nullable GameInfo game) {
                    mGameInfoAdapter = new GameInfoAdapter(game, listener, getContext());
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
