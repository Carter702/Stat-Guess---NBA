package com.carter.khyri.statguess_nba.view.adapter;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.view.ui.GameStatsFragment;

import org.w3c.dom.Text;


public class GameInfoAdapter extends RecyclerView.Adapter<GameInfoAdapter.GameViewHolder> {
    private GameInfo gameList;

    public GameInfoAdapter(GameInfo gameList) { this.gameList = gameList; }

    @NonNull
    @Override
    public GameInfoAdapter.GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_game, parent, false);

        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder gameViewHolder, int position) {

        GameInfo.Game game = gameList.getGames().get(position);
        gameViewHolder.cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView tview = v.findViewById(R.id.home_city);
                String text = tview.getText().toString();
                Log.i("DEBUG", "onClick: THIS HAS BEEN CLICKED: " + text);
            }
        });

        String hTeam = game.getHTeam().getTriCode();
        String hScore = game.getHTeam().getScore();
        String aTeam = game.getVTeam().getTriCode();
        String aScore = game.getVTeam().getScore();
        String quarter = getQuarter(game);
        String clock = game.getClock();
        if(game.getPeriod().getCurrent() > 4) {
            getOvertimePoints(gameViewHolder, game);
            gameViewHolder.txtAwayaOtPoints.setVisibility(View.VISIBLE);
            gameViewHolder.txtHomeOtPoints.setVisibility(View.VISIBLE);
            gameViewHolder.txtGameOt.setVisibility(View.VISIBLE);
        }

        if (game.getStatusNum() == 1) {
            clock = game.getStartTimeEastern();
            quarter = "";
        }
        else if ((game.getPeriod().isIsHalftime())) {
            clock = "HALFTIME";
            quarter = "";
        }
        else if (game.getStatusNum() == 3) {
            clock = "FINAL";
            quarter = "";
        }

        gameViewHolder.txtGameQuarter.setText(quarter);
        gameViewHolder.txtGameTime.setText(clock);

        gameViewHolder.txtHomeCity.setText(hTeam);
        gameViewHolder.txtHomeScore.setText(hScore);
        gameViewHolder.homeLogo.setImageResource(getLogo(hTeam));

        gameViewHolder.txtAwayCity.setText(aTeam);
        gameViewHolder.txtAwayScore.setText(aScore);
        gameViewHolder.awayLogo.setImageResource(getLogo(aTeam));

        if( !(game.getHTeam().getLinescore().isEmpty()) ) {
            gameViewHolder.txtHomeFirstPoints.setText(game.getHTeam().getLinescore().get(0).getScore());
            gameViewHolder.txtHomeSecondPoints.setText(game.getHTeam().getLinescore().get(1).getScore());
            gameViewHolder.txtHomeThirdPoints.setText(game.getHTeam().getLinescore().get(2).getScore());
            gameViewHolder.txtHomeFourthPoints.setText(game.getHTeam().getLinescore().get(3).getScore());
            gameViewHolder.txtAwayFirstPoints.setText(game.getVTeam().getLinescore().get(0).getScore());
            gameViewHolder.txtAwaySecondPoints.setText(game.getVTeam().getLinescore().get(1).getScore());
            gameViewHolder.txtAwayThirdPoints.setText(game.getVTeam().getLinescore().get(2).getScore());
            gameViewHolder.txtAwayFourthPoints.setText(game.getVTeam().getLinescore().get(3).getScore());
        }

    }

    private String getQuarter(GameInfo.Game game) {
        int quarterNum = game.getPeriod().getCurrent();
        String quarter;

        switch (quarterNum) {
            case 1:
                quarter = "1st";
                break;
            case 2:
                quarter = "2nd";
                break;
            case 3:
                quarter = "3rd";
                break;
            case 4:
                quarter = "4th";
                break;
            case 5:
                quarter = "OT-1";
                        break;
            case 6:
                quarter = "OT-2";
                break;
            case 7:
                quarter = "OT-3";
                break;
         default:
             quarter = "0";
        }

        return quarter;
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

    private void getOvertimePoints(GameViewHolder viewHolder, GameInfo.Game game) {
        int totalHome = 0, totalAway = 0;
        int end = game.getPeriod().getCurrent();
        int index = game.getPeriod().getMaxRegular();

        for (int i = index; i < end; i++) {
            totalAway += Integer.parseInt(game.getVTeam().getLinescore().get(i).getScore());
            totalHome += Integer.parseInt(game.getHTeam().getLinescore().get(i).getScore());
        }

        viewHolder.txtHomeOtPoints.setText(Integer.toString(totalHome));
        viewHolder.txtAwayaOtPoints.setText(Integer.toString(totalAway));
    }

    @Override
    public int getItemCount() { return gameList.getNumGames(); }

    public class GameViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView txtGameTime, txtGameQuarter, txtGameOt;
        TextView txtHomeCity, txtHomeScore, txtHomeFirstPoints, txtHomeSecondPoints, txtHomeThirdPoints, txtHomeFourthPoints, txtHomeOtPoints;
        TextView txtAwayCity, txtAwayScore, txtAwayFirstPoints, txtAwaySecondPoints, txtAwayThirdPoints, txtAwayFourthPoints, txtAwayaOtPoints;
        ImageView awayLogo, homeLogo;

        public GameViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.game_card);
            txtHomeCity = (TextView) itemView.findViewById(R.id.home_city);
            txtHomeScore = (TextView) itemView.findViewById(R.id.home_score);
            homeLogo = (ImageView) itemView.findViewById(R.id.home_logo);
            txtHomeFirstPoints = (TextView) itemView.findViewById(R.id.first_score_home);
            txtHomeSecondPoints = (TextView) itemView.findViewById(R.id.second_score_home);
            txtHomeThirdPoints = (TextView) itemView.findViewById(R.id.third_score_home);
            txtHomeFourthPoints = (TextView) itemView.findViewById(R.id.fourth_score_home);
            txtHomeOtPoints = (TextView) itemView.findViewById(R.id.ot_score_home);


            txtAwayCity = (TextView) itemView.findViewById(R.id.away_city);
            txtAwayScore = (TextView) itemView.findViewById(R.id.away_score);
            awayLogo = (ImageView) itemView.findViewById(R.id.away_logo);
            txtAwayFirstPoints = (TextView) itemView.findViewById(R.id.first_score_away);
            txtAwaySecondPoints = (TextView) itemView.findViewById(R.id.second_score_away);
            txtAwayThirdPoints = (TextView) itemView.findViewById(R.id.third_score_away);
            txtAwayFourthPoints = (TextView) itemView.findViewById(R.id.fourth_score_away);
            txtAwayaOtPoints = (TextView) itemView.findViewById(R.id.ot_score_away);

            txtGameTime = (TextView) itemView.findViewById(R.id.game_time);
            txtGameQuarter = (TextView) itemView.findViewById(R.id.game_quarter);
            txtGameOt = (TextView) itemView.findViewById(R.id.ot_total);
        }

    }

}
