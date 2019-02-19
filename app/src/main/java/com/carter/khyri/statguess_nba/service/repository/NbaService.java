package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.GameList;
import com.carter.khyri.statguess_nba.service.model.GameStat;
import com.carter.khyri.statguess_nba.service.model.Player;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface NbaService {

    // date format: 20190110
    @GET("prod/v1/{date}/scoreboard.json")
    Call<GameList> getGameData(@Path("date") String date);

    @GET("prod/v1/{date}/{gameId}_boxscore.json")
    Call<GameStat> getGameStats(@Path("date") String date, @Path("gameId") String gameId);

//    @GET("prod/v2/2018/teams.json")
//    Call<Team> getLeagueTeams();

    @GET("/prod/v1/2018/players.json")
    Call<Player> getPlayers();



}
