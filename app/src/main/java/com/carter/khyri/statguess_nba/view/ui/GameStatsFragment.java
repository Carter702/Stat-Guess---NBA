package com.carter.khyri.statguess_nba.view.ui;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.utils.CommonUtils;
import com.carter.khyri.statguess_nba.viewmodel.GameStatsViewModel;
import com.carter.khyri.statguess_nba.viewmodel.SharedViewModel;

public class GameStatsFragment extends Fragment {

    private GameStatsViewModel mViewModel;

    private GameStat gameStat = new GameStat();
    private String gameId;
    private String homeTri, awayTri;
    private GameList.Game sharedGame;

    public static GameStatsFragment newInstance() { return new GameStatsFragment();  }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mViewModel = ViewModelProviders.of(this).get(GameStatsViewModel.class);
        SharedViewModel sharedModel = ViewModelProviders.of(getActivity()).get(SharedViewModel.class);
        sharedModel.getGame().observe(this, new Observer<GameList.Game>() {
            @Override
            public void onChanged(@Nullable GameList.Game game) {
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
        updateUI(view);

        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }

    private void updateUI(View v) {
        TextView homeCity = v.findViewById(R.id.home_city);
        TextView awayCity = v.findViewById(R.id.away_city);
        ImageView homeLogo = v.findViewById(R.id.home_logo);
        ImageView awayLogo = v.findViewById(R.id.away_logo);

        homeCity.setText(homeTri);
        awayCity.setText(awayTri);
        homeLogo.setImageResource(CommonUtils.getLogo(homeTri));
        awayLogo.setImageResource(CommonUtils.getLogo(awayTri));

    }

    public void setGameInfo(String id, String homeTriCode, String awayTriCode) {
        this.gameId = id;
        this.homeTri = homeTriCode;
        this.awayTri = awayTriCode;
    }

    @Override
    public void onDetach() {
        super.onDetach();
    }
}
