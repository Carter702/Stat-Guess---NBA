package com.carter.khyri.statguess_nba.adapters;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
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
        GameInfo.Game game = gameList.getGames().get(position);

        String hTeam = game.getHTeam().getTriCode();
        String hScore = game.getHTeam().getScore();
        String aTeam = game.getVTeam().getTriCode();
        String aScore = game.getVTeam().getScore();
        String quarter = Integer.toString(game.getPeriod().getCurrent());
        if (game.getPeriod().getCurrent() > game.getPeriod().getMaxRegular()) {
            int otQuarter = game.getPeriod().getMaxRegular() - game.getPeriod().getCurrent();
            quarter = "OT" + Integer.toString(otQuarter);
        }
        String clock = game.getClock();
        if (clock.isEmpty() && quarter.equals("0"))
            clock = "TODAY";
        else if ((game.getPeriod().isIsHalftime()))
            clock = "HALFTIME";
        else if (clock.isEmpty() && quarter.equals("4"))
            clock = "FINAL";

        gameViewHolder.txtGameQuarter.setText(quarter);
        gameViewHolder.txtHomeCity.setText(hTeam);
        gameViewHolder.txtAwayCity.setText(aTeam);
        gameViewHolder.txtGameTime.setText(clock);
        gameViewHolder.txtAwayScore.setText(aScore);
        gameViewHolder.txtHomeScore.setText(hScore);
        gameViewHolder.awayLogo.setImageResource(getLogo(game.getVTeam().getTriCode()));
        gameViewHolder.homeLogo.setImageResource(getLogo(game.getHTeam().getTriCode()));
    }

    private int getLogo(String triCode) {

        int resource = 0;
        switch (triCode) {
            case "ATL":
                resource = R.drawable.logo_atl;
                break;
            case "BKN":
                resource = R.drawable.logo_bkn;
                break;
            case "BOS":
                resource = R.drawable.logo_bos;
                break;
            case "CHA":
                resource = R.drawable.logo_cha;
                break;
            case "CHI":
                resource = R.drawable.logo_chi;
                break;
            case "CLE":
                resource = R.drawable.logo_cle;
                break;
            case "DAL":
                resource = R.drawable.logo_dal;
                break;
            case "DEN":
                resource = R.drawable.logo_den;
                break;
            case "DET":
                resource = R.drawable.logo_det;
                break;
            case "GSW":
                resource = R.drawable.logo_gsw;
                break;
            case "HOU":
                resource = R.drawable.logo_hou;
                break;
            case "IND":
                resource = R.drawable.logo_ind;
                break;
            case "LAC":
                resource = R.drawable.logo_lac;
                break;
            case "LAL":
                resource = R.drawable.logo_las;
                break;
            case "MEM":
                resource = R.drawable.logo_mem;
                break;
            case "MIA":
                resource = R.drawable.logo_mia;
                break;
            case "MIL":
                resource = R.drawable.logo_mil;
                break;
            case "MIN":
                resource = R.drawable.logo_min;
                break;
            case "NOP":
                resource = R.drawable.logo_nop;
                break;
            case "NYK":
                resource = R.drawable.logo_nyk;
                break;
            case "OKC":
                resource = R.drawable.logo_okc;
                break;
            case "ORL":
                resource = R.drawable.logo_orl;
                break;
            case "PHI":
                resource = R.drawable.logo_phi;
                break;
            case "PHX":
                resource = R.drawable.logo_phx;
                break;
            case "POR":
                resource = R.drawable.logo_por;
                break;
            case "SAC":
                resource = R.drawable.logo_sac;
                break;
            case "SAS":
                resource = R.drawable.logo_sas;
                break;
            case "TOR":
                resource = R.drawable.logo_tor;
                break;
            case "UTA":
                resource = R.drawable.logo_uta;
                break;
            case "WAS":
                resource = R.drawable.logo_was;
                break;

                default:
                    resource = R.drawable.ic_basketball;
                    break;
        }

        return resource;
    }

    @Override
    public int getItemCount() {
        return gameList.getNumGames();
    }

    public class GameViewHolder extends RecyclerView.ViewHolder {

        TextView txtHomeCity, txtAwayCity, txtHomeScore, txtAwayScore, txtGameTime, txtGameQuarter;
        ImageView awayLogo, homeLogo;

        public GameViewHolder(View itemView) {
            super(itemView);
            txtHomeCity = (TextView) itemView.findViewById(R.id.home_city);
            txtAwayCity = (TextView) itemView.findViewById(R.id.away_city);
            txtHomeScore = (TextView) itemView.findViewById(R.id.home_score);
            txtAwayScore = (TextView) itemView.findViewById(R.id.away_score);
            txtGameTime = (TextView) itemView.findViewById(R.id.game_time);
            txtGameQuarter = (TextView) itemView.findViewById(R.id.game_quarter);
            awayLogo = (ImageView) itemView.findViewById(R.id.away_logo);
            homeLogo = (ImageView) itemView.findViewById(R.id.home_logo);
        }

    }

}
