package com.carter.khyri.statguess_nba.service.repository;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import android.app.Application;
import android.util.Log;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.model.Player;
import com.carter.khyri.statguess_nba.service.model.Players;
import com.carter.khyri.statguess_nba.service.model.Teams;
import com.carter.khyri.statguess_nba.service.utils.CommonUtils;

import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameRepository {
    private NbaService nbaService;
    private PlayerDao playerDao;
    private TeamDao teamDao;
    private LiveData<List<Players>> teamPlayers;
    private LiveData<List<Teams>> allTeams;

    public GameRepository() {}

    public MutableLiveData<GameInfo> getGameData() {
        final MutableLiveData<GameInfo> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameInfo> call = nbaService.getGameData(CommonUtils.getDate());

        call.enqueue(new Callback<GameInfo>() {
            @Override
            public void onResponse(Call<GameInfo> call, Response<GameInfo> response) {
                    data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<GameInfo> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO RESPOND");
            }
        });

        return data;
    }

    public MutableLiveData<GameStat> getGameStats(String gameId) {
        final MutableLiveData<GameStat> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameStat> call = nbaService.getGameStats(CommonUtils.getDate(), gameId);

        call.enqueue(new Callback<GameStat>() {
            @Override
            public void onResponse(Call<GameStat> call, Response<GameStat> response) {
                    data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<GameStat> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO CONNECT");
            }
        });

        return data;
    }

    public MutableLiveData<Player> getPlayers() {
        final MutableLiveData<Player> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<Player> call = nbaService.getPlayers();

        call.enqueue(new Callback<Player>() {
            @Override
            public void onResponse(Call<Player> call, Response<Player> response) {
                data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<Player> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO RESPOND");
            }
        });

        return data;
    }

    //public MutableLiveData<Team> getTeams();

}
