package com.carter.khyri.statguess_nba.service.repository;

import android.arch.lifecycle.LiveData;
import android.arch.lifecycle.MutableLiveData;
import android.support.constraint.solver.Cache;
import android.util.Log;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class GameRepository {
    private NbaService nbaService;
    String gameId;

    public GameRepository(String id) {this.gameId = id;}

    public GameRepository() {}

    public MutableLiveData<GameInfo> getGameData() {
        final MutableLiveData<GameInfo> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameInfo> call = nbaService.getGameData(getDate());

        call.enqueue(new Callback<GameInfo>() {
            @Override
            public void onResponse(Call<GameInfo> call, Response<GameInfo> response) {
                Log.i("DEBUG", "onResponse: SUCCESSFUL CONNECTION");
                if(response != null) {
                    data.setValue(response.body());
                }
                else
                    Log.i("DEBUG", "onResponse: RESPONSE WAS NULL");
            }

            @Override
            public void onFailure(Call<GameInfo> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO RESPOND");
            }
        });

        return data;
    }

    public MutableLiveData<GameStat> getGameStats() {
        final MutableLiveData<GameStat> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameStat> call = nbaService.getGameStats(getDate(), "0021800676");

        return data;
    }

    private String getDate() {
        String curDate = "";
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        curDate = formatter.format(date);

        return curDate;
    }
}
