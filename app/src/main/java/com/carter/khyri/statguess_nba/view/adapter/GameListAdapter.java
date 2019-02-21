package com.carter.khyri.statguess_nba.view.adapter;

import androidx.lifecycle.ViewModelProviders;
import android.content.Context;
import androidx.annotation.NonNull;
import androidx.fragment.app.FragmentActivity;
import androidx.core.content.ContextCompat;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.carter.khyri.statguess_nba.R;
import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.utils.CommonUtils;
import com.carter.khyri.statguess_nba.viewmodel.SharedViewModel;

import java.util.ArrayList;


public class GameListAdapter extends RecyclerView.Adapter<GameListAdapter.GameViewHolder> {
    private GameList gameList;
    private ArrayList<GameList.Game> mGames = new ArrayList<>();
    private ClickListener mListener;
    private Context mContext;
    private SharedViewModel model;

    public interface ClickListener {
        void onItemClicked(GameList.Game game);
    }

    public GameListAdapter(GameList gameList, ClickListener listener, Context context) {
        this.gameList = gameList;
        this.mListener = listener;
        this.mContext = context;
        mGames.clear();
        mGames.addAll(gameList.getGames());
    }

    @NonNull
    @Override
    public GameListAdapter.GameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        final View view = layoutInflater.inflate(R.layout.item_game, parent, false);
        model = ViewModelProviders.of((FragmentActivity) mContext).get(SharedViewModel.class);

        return new GameViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull GameViewHolder gameViewHolder, int position) {

        final GameList.Game game = mGames.get(position);
        model.setGame(game);

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
            hScore = "0";
            aScore = "0";
        }
        else if ((game.getPeriod().isIsHalftime())) {
            clock = "HALFTIME";
            quarter = "";
        }
        else if (game.getStatusNum() == 3) {
            clock = "FINAL";
            quarter = "";
            labelWInner(gameViewHolder, game);
        }

        gameViewHolder.txtGameQuarter.setText(quarter);
        gameViewHolder.txtGameTime.setText(clock);

        gameViewHolder.txtHomeCity.setText(hTeam);
        gameViewHolder.txtHomeScore.setText(hScore);
        gameViewHolder.homeLogo.setImageResource(CommonUtils.getLogo(hTeam));

        gameViewHolder.txtAwayCity.setText(aTeam);
        gameViewHolder.txtAwayScore.setText(aScore);
        gameViewHolder.awayLogo.setImageResource(CommonUtils.getLogo(aTeam));

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

        ((GameViewHolder) gameViewHolder).cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mListener.onItemClicked(game);
            }
        });

    }

    private String getQuarter(GameList.Game game) {
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

    private void getOvertimePoints(GameViewHolder viewHolder, GameList.Game game) {
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

    private void labelWInner(GameViewHolder viewHolder, GameList.Game game) {
        int homeScore = Integer.parseInt(game.getHTeam().getScore());
        int awayScore = Integer.parseInt(game.getVTeam().getScore());
        int orange = ContextCompat.getColor(viewHolder.itemView.getContext(), R.color.materialOrange);
        int white = ContextCompat.getColor(viewHolder.itemView.getContext(), R.color.materialWhite);
        if (homeScore > awayScore) {
            viewHolder.homeWinner.setVisibility(View.VISIBLE);
            viewHolder.txtHomeScore.setTextColor(orange);
            viewHolder.awayWinner.setVisibility(View.INVISIBLE);
            viewHolder.txtAwayScore.setTextColor(white);
        }
        else {
            viewHolder.awayWinner.setVisibility(View.VISIBLE);
            viewHolder.txtAwayScore.setTextColor(orange);
            viewHolder.homeWinner.setVisibility(View.INVISIBLE);
            viewHolder.txtHomeScore.setTextColor(white);
        }
    }

    @Override
    public int getItemCount() { return gameList.getNumGames(); }

    @Override
    public long getItemId(int position) {
        return super.getItemId(position);
    }

    @Override
    public int getItemViewType(int position) {
        return super.getItemViewType(position);
    }

    public static class GameViewHolder extends RecyclerView.ViewHolder {
        CardView cardView;
        TextView txtGameTime, txtGameQuarter, txtGameOt;
        TextView txtHomeCity, txtHomeScore, txtHomeFirstPoints, txtHomeSecondPoints, txtHomeThirdPoints, txtHomeFourthPoints, txtHomeOtPoints;
        TextView txtAwayCity, txtAwayScore, txtAwayFirstPoints, txtAwaySecondPoints, txtAwayThirdPoints, txtAwayFourthPoints, txtAwayaOtPoints;
        ImageView awayLogo, homeLogo, awayWinner, homeWinner;

        public GameViewHolder(View itemView) {
            super(itemView);
            cardView = (CardView) itemView.findViewById(R.id.game_card);
            txtHomeCity = (TextView) itemView.findViewById(R.id.home_city);
            txtHomeScore = (TextView) itemView.findViewById(R.id.home_score);
            homeLogo = (ImageView) itemView.findViewById(R.id.home_logo);
            homeWinner = (ImageView) itemView.findViewById(R.id.winner_home);
            txtHomeFirstPoints = (TextView) itemView.findViewById(R.id.first_score_home);
            txtHomeSecondPoints = (TextView) itemView.findViewById(R.id.second_score_home);
            txtHomeThirdPoints = (TextView) itemView.findViewById(R.id.third_score_home);
            txtHomeFourthPoints = (TextView) itemView.findViewById(R.id.fourth_score_home);
            txtHomeOtPoints = (TextView) itemView.findViewById(R.id.ot_score_home);


            txtAwayCity = (TextView) itemView.findViewById(R.id.away_city);
            txtAwayScore = (TextView) itemView.findViewById(R.id.away_score);
            awayLogo = (ImageView) itemView.findViewById(R.id.away_logo);
            awayWinner = (ImageView) itemView.findViewById(R.id.winner_away);
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
