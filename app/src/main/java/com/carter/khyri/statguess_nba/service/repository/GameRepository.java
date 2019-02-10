package com.carter.khyri.statguess_nba.service.repository;

import androidx.lifecycle.MutableLiveData;
import android.util.Log;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.utils.CommonUtils;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameRepository {
    private NbaService nbaService;

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

    //public MutableLiveData<Player> getPlayers();

    //public MutableLiveData<Team> getTeams();

}
