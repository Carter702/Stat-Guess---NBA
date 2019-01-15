package com.carter.khyri.statguess_nba.service.repository;

import com.carter.khyri.statguess_nba.service.model.GameInfo;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitRequest {
    private static final String URL_BASE = "https://data.nba.net/";

    private static Retrofit retrofit;

    public static Retrofit getRetroInstance() {
        if (retrofit == null) {
            retrofit  = new Retrofit.Builder()
                    .baseUrl(URL_BASE)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }
}
