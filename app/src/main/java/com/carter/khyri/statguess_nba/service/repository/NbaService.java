package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.GameInfo;
import com.carter.khyri.statguess_nba.service.model.GameStat;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NbaService {

    // date format: 20190110
    @GET("prod/v1/{date}/scoreboard.json")
    Call<GameInfo> getGameData(@Path("date") String date);

    @GET("prod/v1/{date}/{gameId}_boxscore.json")
    Call<GameStat> getGameStats(@Path("date") String date, @Path("gameId") String gameId);

    //@GET("http://data.nba.net/10s/prod/v1/2018/players.json")
    //Call<> getPlayers(@Path(""));
}
