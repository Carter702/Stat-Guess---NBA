package com.carter.khyri.statguess_nba.view.ui;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.icu.text.SimpleDateFormat;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.repository.GameRepository;
import com.carter.khyri.statguess_nba.view.adapter.GameInfoAdapter;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.repository.NbaService;
import com.carter.khyri.statguess_nba.viewmodel.GameInfoViewModel;

import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class GameInfoFragment extends Fragment {

    GameInfoViewModel mViewModel;
    GameInfo games = new GameInfo();
    RecyclerView mRecyclerView;
    GameInfoAdapter mGameInfoAdapter;
    private static final String TAG = "DEBUG";

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
        //((LinearLayoutManager) mlayoutManager).setOrientation(LinearLayoutManager.VERTICAL);

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
        if (hidden == true)
            Log.i(TAG, "onHiddenChanged: HIDDEN NOW");
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
