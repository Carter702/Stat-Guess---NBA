package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.GameInfo;

//import io.reactivex.Single;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NbaService {
    String HHTP_API_NBA_URL = "https://data.nba.net/";

    // date format: 20190110
    @GET("prod/v1/{date}/scoreboard.json")
    Call<GameInfo> getGameData(@Path("date") String date);

    @GET("/prod/v1/{date}/{gameId}_boxscore.json")
    Call<GameInfo> getGameStats(@Path("date") String date, @Path("gameId") String gameId);
}
