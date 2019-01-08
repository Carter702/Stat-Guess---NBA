package com.carter.khyri.statguess_nba.models;

import java.sql.Time;
import java.util.ArrayList;

public class Game {

    private String mHome;
    private String mAway;
    private String mWinner;
    private String mQuarter;
    private String mGameTime;

    private boolean mIsStarted;
    private boolean mIsHalfTime;
    private boolean mIsEnded;

    private int mHomeScore;
    private int mAwayScore;

    private ArrayList<Team> mTeams;

    public Game() {
        this.mHome = "BKN";
        this.mAway = "LAC";
        this.mQuarter = "4th";
        this.mGameTime = "1:45";
        this.mAwayScore = 46;
        this.mHomeScore = 64;
    }

    public Game(String home, String away, int awayScore, int homeScore, String quarter, String time) {
        this.mHome = home;
        this.mAway = away;
        this.mHomeScore = homeScore;
        this.mAwayScore = awayScore;
        this.mQuarter = quarter;
        this.mGameTime = time;
    }

    public Game(String mHome, String mAway, boolean mIsStarted, boolean mIsHalfTime, boolean mIsEnded, int mHomeScore, int mAwayScore, ArrayList<Team> mTeams) {
        this.mHome = mHome;
        this.mAway = mAway;
        this.mIsStarted = mIsStarted;
        this.mIsHalfTime = mIsHalfTime;
        this.mIsEnded = mIsEnded;
        this.mHomeScore = mHomeScore;
        this.mAwayScore = mAwayScore;
        this.mTeams = mTeams;
    }

    public String getAwayCity() {
        return mAway;
    }

    public String getHomeCity() {
        return mHome;
    }

    public String getQuarter() {
        return mQuarter;
    }

    public int getHomeScore() {
        return mHomeScore;
    }

    public int getAwayScore() {
        return mAwayScore;
    }

    public String getGameTime() {
        return mGameTime;
    }
}
