package com.carter.khyri.statguess_nba.view.ui;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.view.adapter.GameListAdapter;
import com.carter.khyri.statguess_nba.viewmodel.GameListViewModel;


public class GameListFragment extends Fragment{
    private GameListViewModel mViewModel;
    private GameList games = new GameList();
    private RecyclerView mRecyclerView;
    private GameListAdapter mGameListAdapter;


    public GameListFragment() { }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        games = new GameList();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_games, container, false);

        mRecyclerView = (RecyclerView) view.findViewById(R.id.game_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mViewModel = ViewModelProviders.of(this).get(GameListViewModel.class);
        mViewModel.getGames().observe(this, new Observer<GameList>() {
            @Override
            public void onChanged(@Nullable GameList game) {
                mGameListAdapter = new GameListAdapter(game, listener, getContext());
                mRecyclerView.setAdapter(mGameListAdapter);
                games = game;
            }
        });

        return view;
    }

    private GameListAdapter.ClickListener listener = new GameListAdapter.ClickListener() {
        @Override
        public void onItemClicked(GameList.Game game) {
            GameStatsFragment gameStat = new GameStatsFragment();
            gameStat.setGameInfo(game.getGameId(), game.getHTeam().getTriCode(), game.getVTeam().getTriCode());
            getChildFragmentManager().beginTransaction().replace(R.id.game_info_container, gameStat).addToBackStack(null).commit();
        }
    };

    @Override
    public void onHiddenChanged(boolean hidden) {
        super.onHiddenChanged(hidden);
        if (!hidden){
            mViewModel.getGames().observe(this, new Observer<GameList>() {
                @Override
                public void onChanged(@Nullable GameList game) {
                    mGameListAdapter = new GameListAdapter(game, listener, getContext());
                    mRecyclerView.setAdapter(mGameListAdapter);
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
