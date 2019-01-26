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
import android.widget.ImageView;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.utils.CommonUtils;
import com.carter.khyri.statguess_nba.viewmodel.GameStatsViewModel;
import com.carter.khyri.statguess_nba.viewmodel.SharedViewModel;

public class GameStatsFragment extends Fragment {

    private GameStatsViewModel mViewModel;

    private String gameId;
    GameStat gameStat = new GameStat();
    private GameInfo.Game sharedGame;


    public static GameStatsFragment newInstance() { return new GameStatsFragment();  }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(GameStatsViewModel.class);
        SharedViewModel sharedModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        sharedModel.getGame().observe(this, new Observer<GameInfo.Game>() {
            @Override
            public void onChanged(@Nullable GameInfo.Game game) {
                sharedGame = game;
            }
        });


        final Observer<GameStat> statObserver = new Observer<GameStat>() {
            @Override
            public void onChanged(@Nullable GameStat game) {
                gameStat = game;
            }
        };

        mViewModel.getGameStats(gameId).observe(this, statObserver);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_stats_fragment, container, false);
        //updateUI(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void updateUI(View v) {
        // TODO: Get this info from parent fragment
        TextView homeCity = v.findViewById(R.id.home_city);
        TextView awayCity = v.findViewById(R.id.away_city);
        ImageView homeLogo = v.findViewById(R.id.home_logo);
        ImageView awayLogo = v.findViewById(R.id.away_logo);

        String homeTri = sharedGame.getHTeam().getTriCode();
        String awayTri = sharedGame.getVTeam().getTriCode();

        homeCity.setText(homeTri);
        awayCity.setText(awayTri);
        homeLogo.setImageResource(CommonUtils.getLogo(homeTri));
        awayLogo.setImageResource(CommonUtils.getLogo(awayTri));

    }

    public void setGameID(String id) {  this.gameId = id; }

}
