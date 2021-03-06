package com.carter.khyri.statguess_nba.view.ui;

import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.view.adapter.GameListAdapter;
import com.carter.khyri.statguess_nba.viewmodel.GameListViewModel;
import com.carter.khyri.statguess_nba.viewmodel.SharedViewModel;


public class GameListFragment extends Fragment{
    private GameListViewModel mViewModel;
    private SharedViewModel mSharedViewModel;
    private GameList games;
    private RecyclerView mRecyclerView;
    private GameListAdapter mGameListAdapter;
    private TextView emptyView;

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
        emptyView = view.findViewById(R.id.no_game_text);
        mRecyclerView = (RecyclerView) view.findViewById(R.id.game_recycler);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(getContext()));

        mViewModel = ViewModelProviders.of(this).get(GameListViewModel.class);
//        mSharedViewModel = ViewModelProvider.AndroidViewModelFactory.getInstance(getActivity().getApplication());

        callGetGames();
        callGetPlayers();

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
            callGetGames();
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }

    private void callGetGames() {
        mViewModel.getGames().observe(this, new Observer<GameList>() {
            @Override
            public void onChanged(@Nullable GameList game) {
                mGameListAdapter = new GameListAdapter(game, listener, getContext());
                mRecyclerView.setAdapter(mGameListAdapter);
                games = game;

                if(games.getNumGames() == 0) {
                    mRecyclerView.setVisibility(View.GONE);
                    emptyView.setVisibility(View.VISIBLE);
                }
                else {
                    emptyView.setVisibility(View.GONE);
                    mRecyclerView.setVisibility(View.VISIBLE);
                }
            }
        });
    }

    private void callGetPlayers() {
        mViewModel.getPlayers().observe(this, new Observer<Player>() {
            @Override
            public void onChanged(Player player) {
                //mSharedViewModel.insertAll(player.getLeague().getPeople());
            }
        });


    }

}
