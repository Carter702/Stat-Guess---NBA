package com.carter.khyri.statguess_nba.view.ui;

import android.arch.lifecycle.Observer;
import android.arch.lifecycle.ViewModelProviders;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.constraint.ConstraintLayout;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.view.adapter.GameInfoAdapter;
import com.carter.khyri.statguess_nba.viewmodel.GameInfoViewModel;
import com.carter.khyri.statguess_nba.viewmodel.GameStatsViewModel;

public class GameStatsFragment extends Fragment {

    private GameStatsViewModel mViewModel;
    private ConstraintLayout mConstraintLayout;
    GameStat gameStat = new GameStat();

    public static GameStatsFragment newInstance() {
        return new GameStatsFragment();
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.game_stats_fragment, container, false);

        Button mHomePoints = view.findViewById(R.id.button_away_points);
        Button mAwayPoints = view.findViewById(R.id.button_home_points);

        mHomePoints.setText(gameStat.getStats().getHTeam().getPointsInPaint());
        mHomePoints.setText(gameStat.getStats().getVTeam().getPointsInPaint());

        mHomePoints.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getActivity(), "Sharing...", Toast.LENGTH_LONG).show();
            }
        });
        return view;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(GameStatsViewModel.class);

        mViewModel.getGameStats().observe(this, new Observer<GameStat>() {
            @Override
            public void onChanged(@Nullable GameStat game) {
                gameStat = game;
            }
        });
    }

}
