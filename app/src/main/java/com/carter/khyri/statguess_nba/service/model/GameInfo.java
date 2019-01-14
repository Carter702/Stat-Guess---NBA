package com.carter.khyri.statguess_nba.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class GameInfo {

    @SerializedName("_internal")
    @Expose
    private Internal internal;
    @SerializedName("numGames")
    @Expose
    private int numGames;
    @SerializedName("games")
    @Expose
    private List<Game> games = null;

    public Internal getInternal() {
        return internal;
    }

    public void setInternal(Internal internal) {
        this.internal = internal;
    }

    public int getNumGames() {
        return numGames;
    }

    public List<Game> getGames() {
        return games;
    }

    public class Game {

        @SerializedName("seasonStageId")
        @Expose
        private int seasonStageId;
        @SerializedName("seasonYear")
        @Expose
        private String seasonYear;
        @SerializedName("gameId")
        @Expose
        private String gameId;
        @SerializedName("isGameActivated")
        @Expose
        private boolean isGameActivated;
        @SerializedName("statusNum")
        @Expose
        private int statusNum;
        @SerializedName("extendedStatusNum")
        @Expose
        private int extendedStatusNum;
        @SerializedName("startTimeEastern")
        @Expose
        private String startTimeEastern;
        @SerializedName("startTimeUTC")
        @Expose
        private String startTimeUTC;
        @SerializedName("endTimeUTC")
        @Expose
        private String endTimeUTC;
        @SerializedName("startDateEastern")
        @Expose
        private String startDateEastern;
        @SerializedName("clock")
        @Expose
        private String clock;
        @SerializedName("isBuzzerBeater")
        @Expose
        private boolean isBuzzerBeater;
        @SerializedName("isPreviewArticleAvail")
        @Expose
        private boolean isPreviewArticleAvail;
        @SerializedName("isRecapArticleAvail")
        @Expose
        private boolean isRecapArticleAvail;
        @SerializedName("hasGameBookPdf")
        @Expose
        private boolean hasGameBookPdf;
        @SerializedName("isStartTimeTBD")
        @Expose
        private boolean isStartTimeTBD;
        @SerializedName("nugget")
        @Expose
        private Nugget nugget;
        @SerializedName("attendance")
        @Expose
        private String attendance;
        @SerializedName("gameDuration")
        @Expose
        private GameDuration gameDuration;
        @SerializedName("period")
        @Expose
        private Period period;
        @SerializedName("vTeam")
        @Expose
        private VTeam vTeam;
        @SerializedName("hTeam")
        @Expose
        private HTeam hTeam;

        public int getSeasonStageId() {
            return seasonStageId;
        }

        public String getSeasonYear() {
            return seasonYear;
        }

        public String getGameId() {
            return gameId;
        }

        public boolean isIsGameActivated() {
            return isGameActivated;
        }

        public int getStatusNum() {
            return statusNum;
        }

        public int getExtendedStatusNum() {
            return extendedStatusNum;
        }

        public String getStartTimeEastern() {
            return startTimeEastern;
        }

        public String getStartTimeUTC() {
            return startTimeUTC;
        }

        public String getEndTimeUTC() {
            return endTimeUTC;
        }

        public String getStartDateEastern() {
            return startDateEastern;
        }

        public String getClock() {
            return clock;
        }

        public boolean isIsBuzzerBeater() {
            return isBuzzerBeater;
        }

        public boolean isIsPreviewArticleAvail() {
            return isPreviewArticleAvail;
        }

        public boolean isIsRecapArticleAvail() {
            return isRecapArticleAvail;
        }

        public boolean isHasGameBookPdf() {
            return hasGameBookPdf;
        }

        public boolean isIsStartTimeTBD() {
            return isStartTimeTBD;
        }

        public Nugget getNugget() {
            return nugget;
        }

        public String getAttendance() {
            return attendance;
        }

        public GameDuration getGameDuration() {
            return gameDuration;
        }

        public Period getPeriod() {
            return period;
        }

        public VTeam getVTeam() {
            return vTeam;
        }

        public HTeam getHTeam() {
            return hTeam;
        }
    }

    public class HTeam {

        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("triCode")
        @Expose
        private String triCode;
        @SerializedName("win")
        @Expose
        private String win;
        @SerializedName("loss")
        @Expose
        private String loss;
        @SerializedName("seriesWin")
        @Expose
        private String seriesWin;
        @SerializedName("seriesLoss")
        @Expose
        private String seriesLoss;
        @SerializedName("score")
        @Expose
        private String score;
        @SerializedName("linescore")
        @Expose
        private List<Linescore_> linescore = null;

        public String getTeamId() {
            return teamId;
        }

        public String getTriCode() {
            return triCode;
        }

        public String getWin() {
            return win;
        }

        public String getLoss() {
            return loss;
        }

        public String getSeriesWin() {
            return seriesWin;
        }

        public String getSeriesLoss() {
            return seriesLoss;
        }

        public String getScore() {
            return score;
        }

        public List<Linescore_> getLinescore() {
            return linescore;
        }
    }

    public class VTeam {

        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("triCode")
        @Expose
        private String triCode;
        @SerializedName("win")
        @Expose
        private String win;
        @SerializedName("loss")
        @Expose
        private String loss;
        @SerializedName("seriesWin")
        @Expose
        private String seriesWin;
        @SerializedName("seriesLoss")
        @Expose
        private String seriesLoss;
        @SerializedName("score")
        @Expose
        private String score;
        @SerializedName("linescore")
        @Expose
        private List<Linescore> linescore = null;

        public String getTeamId() {
            return teamId;
        }

        public String getTriCode() {
            return triCode;
        }

        public String getWin() {
            return win;
        }

        public String getLoss() {
            return loss;
        }

        public String getSeriesWin() {
            return seriesWin;
        }

        public String getSeriesLoss() {
            return seriesLoss;
        }

        public String getScore() {
            return score;
        }

        public List<Linescore> getLinescore() {
            return linescore;
        }
    }

    public class Internal {

        @SerializedName("pubDateTime")
        @Expose
        private String pubDateTime;
        @SerializedName("xslt")
        @Expose
        private String xslt;
        @SerializedName("eventName")
        @Expose
        private String eventName;

        public String getPubDateTime() {
            return pubDateTime;
        }

        public String getXslt() {
            return xslt;
        }

        public String getEventName() {
            return eventName;
        }
    }

    public class Linescore {

        @SerializedName("score")
        @Expose
        private String score;

        public String getScore() { return score; }

    }

    public class Linescore_ {

        @SerializedName("score")
        @Expose
        private String score;

        public String getScore() { return score; }
    }

    public class Nugget {

        @SerializedName("text")
        @Expose
        private String text;

        public String getText() {
            return text;
        }
    }

    public class Period {

        @SerializedName("current")
        @Expose
        private int current;
        @SerializedName("type")
        @Expose
        private int type;
        @SerializedName("maxRegular")
        @Expose
        private int maxRegular;
        @SerializedName("isHalftime")
        @Expose
        private boolean isHalftime;
        @SerializedName("isEndOfPeriod")
        @Expose
        private boolean isEndOfPeriod;

        public int getCurrent() {
            return current;
        }

        public int getType() {
            return type;
        }

        public int getMaxRegular() {
            return maxRegular;
        }

        public boolean isIsHalftime() {
            return isHalftime;
        }

        public boolean isIsEndOfPeriod() {
            return isEndOfPeriod;
        }

    }

    public class GameDuration {

        @SerializedName("hours")
        @Expose
        private String hours;
        @SerializedName("minutes")
        @Expose
        private String minutes;

        public String getHours() {
            return hours;
        }

        public String getMinutes() {
            return minutes;
        }

    }
}




