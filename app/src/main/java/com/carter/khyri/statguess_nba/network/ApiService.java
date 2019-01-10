package com.carter.khyri.statguess_nba.network;

import com.carter.khyri.statguess_nba.models.Games;

//import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface ApiService {

    @GET("10s/prod/v1/20190109/scoreboard.json")
    Call<Games> getGameData();
}
