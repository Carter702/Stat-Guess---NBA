package com.carter.khyri.statguess_nba.service.utils;

import android.app.Application;
import android.content.Context;

public class GlobalAppContext extends Application {


    private static Context appContext;

    @Override
    public void onCreate() {
        super.onCreate();
        appContext = getApplicationContext();

        /* If you has other classes that need context object to initialize when application is created,
         you can use the appContext here to process. */
    }

    public static Context getAppContext() {
        return appContext;
    }
}
