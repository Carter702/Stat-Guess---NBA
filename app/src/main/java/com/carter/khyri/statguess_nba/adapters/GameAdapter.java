package com.carter.khyri.statguess_nba.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.models.GameInfo;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private GameInfo gameList;

    public GameAdapter(GameInfo gameList) {
        this.gameList = gameList;
    }

    @NonNull
    @Override
    public GameAdapter.GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_game, parent, false);

        GameViewHolder gameViewHolder = new GameViewHolder(view);
        return gameViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder gameViewHolder, int position) {

        String hTeam = gameList.getGames().get(position).getHTeam().getTriCode();
        String hScore = gameList.getGames().get(position).getHTeam().getScore();
        String aTeam = gameList.getGames().get(position).getVTeam().getTriCode();
        String aScore = gameList.getGames().get(position).getVTeam().getScore();
        String quarter = Integer.toString(gameList.getGames().get(position).getPeriod().getCurrent());
        String clock = gameList.getGames().get(position).getClock();
        if (clock.isEmpty())
            clock = "FINAL";

        gameViewHolder.txtGameQuarter.setText(quarter);
        gameViewHolder.txtHomeCity.setText(hTeam);
        gameViewHolder.txtAwayCity.setText(aTeam);
        gameViewHolder.txtGameTime.setText(clock);
        gameViewHolder.txtAwayScore.setText(aScore);
        gameViewHolder.txtHomeScore.setText(hScore);
    }

    @Override
    public int getItemCount() {
        return gameList.getNumGames();
    }

    public class GameViewHolder extends RecyclerView.ViewHolder {

        TextView txtHomeCity, txtAwayCity, txtHomeScore, txtAwayScore, txtGameTime, txtGameQuarter;

        public GameViewHolder(View itemView) {
            super(itemView);
            txtHomeCity = (TextView) itemView.findViewById(R.id.home_city);
            txtAwayCity = (TextView) itemView.findViewById(R.id.away_city);
            txtHomeScore = (TextView) itemView.findViewById(R.id.home_score);
            txtAwayScore = (TextView) itemView.findViewById(R.id.away_score);
            txtGameTime = (TextView) itemView.findViewById(R.id.game_time);
            txtGameQuarter = (TextView) itemView.findViewById(R.id.game_quarter);
        }

    }
}
