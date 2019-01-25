package com.carter.khyri.statguess_nba.service.repository;

import android.arch.lifecycle.MutableLiveData;
import android.util.Log;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class GameRepository {
    private NbaService nbaService;

    public GameRepository() {}

    public MutableLiveData<GameInfo> getGameData() {
        final MutableLiveData<GameInfo> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameInfo> call = nbaService.getGameData(getDate());

        call.enqueue(new Callback<GameInfo>() {
            @Override
            public void onResponse(Call<GameInfo> call, Response<GameInfo> response) {
                Log.i("DEBUG", "onResponse: SUCCESSFUL CONNECTION");
                    data.setValue(response.body());
            }

            @Override
            public void onFailure(Call<GameInfo> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO RESPOND");
            }
        });

        return data;
    }

    public MutableLiveData<GameStat> getGameStats(String id) {
        final MutableLiveData<GameStat> data = new MutableLiveData<>();

        nbaService = RetrofitRequest.getRetroInstance().create(NbaService.class);
        Call<GameStat> call = nbaService.getGameStats(getDate(), id);

        call.enqueue(new Callback<GameStat>() {
            @Override
            public void onResponse(Call<GameStat> call, Response<GameStat> response) {
                Log.i("DEBUG", "onResponse: CONNECTED!!");
                    data.setValue(response.body());
                Log.i("DEBUG", "onResponse: NETWORK CALL DONE");

            }

            @Override
            public void onFailure(Call<GameStat> call, Throwable t) {
                Log.i("DEBUG", "onFailure: FAILED TO CONNECT");
            }
        });

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
