package com.carter.khyri.statguess_nba.network;

import com.carter.khyri.statguess_nba.models.GameInfo;

//import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    // date format: 20190110
    @GET("10s/prod/v1/{date}/scoreboard.json")
    Call<GameInfo> getGameData(@Path("date") String date);
}
