package com.carter.khyri.statguess_nba.models;

import java.util.ArrayList;

public class Game {

    private String mHome;
    private String mAway;
    private String mWinner;

    private boolean mIsStarted;
    private boolean mIsHalfTime;
    private boolean mIsEnded;

    private int mHomeScore;
    private int mAwayScore;

    private ArrayList<Team> mTeams;

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
}
