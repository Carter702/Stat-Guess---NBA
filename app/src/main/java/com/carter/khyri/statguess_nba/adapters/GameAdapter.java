package com.carter.khyri.statguess_nba.adapters;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.models.Game;

import org.w3c.dom.Text;

import java.util.ArrayList;

public class GameAdapter extends RecyclerView.Adapter<GameAdapter.GameViewHolder> {

    private ArrayList<Game> gameList;

    public GameAdapter(ArrayList<Game> gameList) {
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

        gameViewHolder.txtGameQuarter.setText(gameList.get(position).getQuarter());
        gameViewHolder.txtHomeCity.setText(gameList.get(position).getHomeCity());
        gameViewHolder.txtAwayCity.setText(gameList.get(position).getAwayCity());
        gameViewHolder.txtGameTime.setText(gameList.get(position).getGameTime());
        String temp = Integer.toString(gameList.get(position).getAwayScore());
        gameViewHolder.txtAwayScore.setText(temp);
        temp = Integer.toString(gameList.get(position).getHomeScore());
        gameViewHolder.txtHomeScore.setText(temp);

    }

    @Override
    public int getItemCount() {
        return gameList.size();
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
