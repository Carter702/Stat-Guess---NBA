package com.carter.khyri.statguess_nba.service.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

public class GameStat {
    @SerializedName("_internal")
    @Expose
    private Internal internal;
    @SerializedName("basicGameData")
    @Expose
    private BasicGameData basicGameData;
    @SerializedName("stats")
    @Expose
    private Stats stats;

    public Internal getInternal() {
        return internal;
    }

    public BasicGameData getBasicGameData() {
        return basicGameData;
    }

    public Stats getStats() {
        return stats;
    }

    public class ActivePlayer {

        @SerializedName("personId")
        @Expose
        private String personId;
        @SerializedName("teamId")
        @Expose
        private String teamId;
        @SerializedName("isOnCourt")
        @Expose
        private boolean isOnCourt;
        @SerializedName("points")
        @Expose
        private String points;
        @SerializedName("pos")
        @Expose
        private String pos;
        @SerializedName("min")
        @Expose
        private String min;
        @SerializedName("fgm")
        @Expose
        private String fgm;
        @SerializedName("fga")
        @Expose
        private String fga;
        @SerializedName("fgp")
        @Expose
        private String fgp;
        @SerializedName("ftm")
        @Expose
        private String ftm;
        @SerializedName("fta")
        @Expose
        private String fta;
        @SerializedName("ftp")
        @Expose
        private String ftp;
        @SerializedName("tpm")
        @Expose
        private String tpm;
        @SerializedName("tpa")
        @Expose
        private String tpa;
        @SerializedName("tpp")
        @Expose
        private String tpp;
        @SerializedName("offReb")
        @Expose
        private String offReb;
        @SerializedName("defReb")
        @Expose
        private String defReb;
        @SerializedName("totReb")
        @Expose
        private String totReb;
        @SerializedName("assists")
        @Expose
        private String assists;
        @SerializedName("pFouls")
        @Expose
        private String pFouls;
        @SerializedName("steals")
        @Expose
        private String steals;
        @SerializedName("turnovers")
        @Expose
        private String turnovers;
        @SerializedName("blocks")
        @Expose
        private String blocks;
        @SerializedName("plusMinus")
        @Expose
        private String plusMinus;
        @SerializedName("dnp")
        @Expose
        private String dnp;
        @SerializedName("sortKey")
        @Expose
        private SortKey sortKey;

        public String getPersonId() {
            return personId;
        }

        public String getTeamId() {
            return teamId;
        }

        public boolean isIsOnCourt() {
            return isOnCourt;
        }

        public String getPoints() {
            return points;
        }

        public String getPos() {
            return pos;
        }

        public String getMin() {
            return min;
        }

        public String getFgm() {
            return fgm;
        }

        public String getFga() {
            return fga;
        }

        public String getFgp() {
            return fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public String getFta() {
            return fta;
        }

        public String getFtp() {
            return ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public String getAssists() {
            return assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public String getDnp() {
            return dnp;
        }

        public SortKey getSortKey() {
            return sortKey;
        }

    }

    public class Assists {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player__> players = null;

        public String getValue() {
            return value;
        }

        public List<Player__> getPlayers() {
            return players;
        }

    }

    public class Assists_ {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player_____> players = null;

        public String getValue() {
            return value;
        }

        public List<Player_____> getPlayers() {
            return players;
        }

    }

    public class BasicGameData {

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
        @SerializedName("attendance")
        @Expose
        private String attendance;
        @SerializedName("gameDuration")
        @Expose
        private GameDuration gameDuration;
        @SerializedName("vTeam")
        @Expose
        private VTeamStats vTeam;
        @SerializedName("hTeam")
        @Expose
        private HTeamStats hTeam;

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

        public String getAttendance() {
            return attendance;
        }

        public GameDuration getGameDuration() {
            return gameDuration;
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

    public class HTeamStats {

        @SerializedName("fastBreakPoints")
        @Expose
        private String fastBreakPoints;
        @SerializedName("pointsInPaint")
        @Expose
        private String pointsInPaint;
        @SerializedName("biggestLead")
        @Expose
        private String biggestLead;
        @SerializedName("secondChancePoints")
        @Expose
        private String secondChancePoints;
        @SerializedName("pointsOffTurnovers")
        @Expose
        private String pointsOffTurnovers;
        @SerializedName("longestRun")
        @Expose
        private String longestRun;
        @SerializedName("totals")
        @Expose
        private Totals_ totals;
        @SerializedName("leaders")
        @Expose
        private Leaders_ leaders;

        public String getFastBreakPoints() {
            return fastBreakPoints;
        }

        public String getPointsInPaint() {
            return pointsInPaint;
        }

        public String getBiggestLead() {
            return biggestLead;
        }

        public String getSecondChancePoints() {
            return secondChancePoints;
        }

        public String getPointsOffTurnovers() {
            return pointsOffTurnovers;
        }

        public String getLongestRun() {
            return longestRun;
        }

        public Totals_ getTotals() {
            return totals;
        }

        public Leaders_ getLeaders() {
            return leaders;
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

    public class Leaders {

        @SerializedName("points")
        @Expose
        private Points points;
        @SerializedName("rebounds")
        @Expose
        private Rebounds rebounds;
        @SerializedName("assists")
        @Expose
        private Assists assists;

        public Points getPoints() {
            return points;
        }

        public Rebounds getRebounds() {
            return rebounds;
        }

        public Assists getAssists() {
            return assists;
        }


    }

    public class Leaders_ {

        @SerializedName("points")
        @Expose
        private Points_ points;
        @SerializedName("rebounds")
        @Expose
        private Rebounds_ rebounds;
        @SerializedName("assists")
        @Expose
        private Assists_ assists;

        public Points_ getPoints() {
            return points;
        }

        public Rebounds_ getRebounds() {
            return rebounds;
        }

        public Assists_ getAssists() {
            return assists;
        }


    }

    public class Player {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

    }

    public class Player_ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

    }

    public class Player__ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

    }

    public class Player___ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }


    }

    public class Player____ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }


    }

    public class Player_____ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

    }

    public class Points {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player> players = null;

        public String getValue() {
            return value;
        }

        public List<Player> getPlayers() {
            return players;
        }

    }

    public class Points_ {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player___> players = null;

        public String getValue() {
            return value;
        }

        public List<Player___> getPlayers() {
            return players;
        }

    }

    public class Rebounds {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player_> players = null;

        public String getValue() {
            return value;
        }

        public List<Player_> getPlayers() {
            return players;
        }

    }

    public class Rebounds_ {

        @SerializedName("value")
        @Expose
        private String value;
        @SerializedName("players")
        @Expose
        private List<Player____> players = null;

        public String getValue() {
            return value;
        }

        public List<Player____> getPlayers() {
            return players;
        }


    }

    public class SortKey {

        @SerializedName("name")
        @Expose
        private int name;
        @SerializedName("pos")
        @Expose
        private int pos;
        @SerializedName("points")
        @Expose
        private int points;
        @SerializedName("min")
        @Expose
        private int min;
        @SerializedName("fgm")
        @Expose
        private int fgm;
        @SerializedName("fga")
        @Expose
        private int fga;
        @SerializedName("fgp")
        @Expose
        private int fgp;
        @SerializedName("ftm")
        @Expose
        private int ftm;
        @SerializedName("fta")
        @Expose
        private int fta;
        @SerializedName("ftp")
        @Expose
        private int ftp;
        @SerializedName("tpm")
        @Expose
        private int tpm;
        @SerializedName("tpa")
        @Expose
        private int tpa;
        @SerializedName("tpp")
        @Expose
        private int tpp;
        @SerializedName("offReb")
        @Expose
        private int offReb;
        @SerializedName("defReb")
        @Expose
        private int defReb;
        @SerializedName("totReb")
        @Expose
        private int totReb;
        @SerializedName("assists")
        @Expose
        private int assists;
        @SerializedName("pFouls")
        @Expose
        private int pFouls;
        @SerializedName("steals")
        @Expose
        private int steals;
        @SerializedName("turnovers")
        @Expose
        private int turnovers;
        @SerializedName("blocks")
        @Expose
        private int blocks;
        @SerializedName("plusMinus")
        @Expose
        private int plusMinus;

        public int getName() {
            return name;
        }

        public int getPos() {
            return pos;
        }

        public int getPoints() {
            return points;
        }

        public int getMin() {
            return min;
        }

        public int getFgm() {
            return fgm;
        }

        public int getFga() {
            return fga;
        }

        public int getFgp() {
            return fgp;
        }

        public int getFtm() {
            return ftm;
        }

        public int getFta() {
            return fta;
        }

        public int getFtp() {
            return ftp;
        }

        public int getTpm() {
            return tpm;
        }

        public int getTpa() {
            return tpa;
        }

        public int getTpp() {
            return tpp;
        }

        public int getOffReb() {
            return offReb;
        }

        public int getDefReb() {
            return defReb;
        }

        public int getTotReb() {
            return totReb;
        }

        public int getAssists() {
            return assists;
        }

        public int getPFouls() {
            return pFouls;
        }

        public int getSteals() {
            return steals;
        }

        public int getTurnovers() {
            return turnovers;
        }

        public int getBlocks() {
            return blocks;
        }

        public int getPlusMinus() {
            return plusMinus;
        }

    }

    public class Stats {

        @SerializedName("timesTied")
        @Expose
        private String timesTied;
        @SerializedName("leadChanges")
        @Expose
        private String leadChanges;
        @SerializedName("vTeam")
        @Expose
        private VTeamStats vTeam;
        @SerializedName("hTeam")
        @Expose
        private HTeamStats hTeam;
        @SerializedName("activePlayers")
        @Expose
        private List<ActivePlayer> activePlayers = null;

        public String getTimesTied() {
            return timesTied;
        }

        public String getLeadChanges() {
            return leadChanges;
        }

        public VTeamStats getVTeam() {
            return vTeam;
        }

        public HTeamStats getHTeam() {
            return hTeam;
        }

        public List<ActivePlayer> getActivePlayers() {
            return activePlayers;
        }

    }

    public class Totals {

        @SerializedName("points")
        @Expose
        private String points;
        @SerializedName("fgm")
        @Expose
        private String fgm;
        @SerializedName("fga")
        @Expose
        private String fga;
        @SerializedName("fgp")
        @Expose
        private String fgp;
        @SerializedName("ftm")
        @Expose
        private String ftm;
        @SerializedName("fta")
        @Expose
        private String fta;
        @SerializedName("ftp")
        @Expose
        private String ftp;
        @SerializedName("tpm")
        @Expose
        private String tpm;
        @SerializedName("tpa")
        @Expose
        private String tpa;
        @SerializedName("tpp")
        @Expose
        private String tpp;
        @SerializedName("offReb")
        @Expose
        private String offReb;
        @SerializedName("defReb")
        @Expose
        private String defReb;
        @SerializedName("totReb")
        @Expose
        private String totReb;
        @SerializedName("assists")
        @Expose
        private String assists;
        @SerializedName("pFouls")
        @Expose
        private String pFouls;
        @SerializedName("steals")
        @Expose
        private String steals;
        @SerializedName("turnovers")
        @Expose
        private String turnovers;
        @SerializedName("blocks")
        @Expose
        private String blocks;
        @SerializedName("plusMinus")
        @Expose
        private String plusMinus;
        @SerializedName("min")
        @Expose
        private String min;

        public String getPoints() {
            return points;
        }

        public String getFgm() {
            return fgm;
        }

        public String getFga() {
            return fga;
        }

        public String getFgp() {
            return fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public String getFta() {
            return fta;
        }

        public String getFtp() {
            return ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public String getAssists() {
            return assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public String getMin() {
            return min;
        }


    }

    public class Totals_ {

        @SerializedName("points")
        @Expose
        private String points;
        @SerializedName("fgm")
        @Expose
        private String fgm;
        @SerializedName("fga")
        @Expose
        private String fga;
        @SerializedName("fgp")
        @Expose
        private String fgp;
        @SerializedName("ftm")
        @Expose
        private String ftm;
        @SerializedName("fta")
        @Expose
        private String fta;
        @SerializedName("ftp")
        @Expose
        private String ftp;
        @SerializedName("tpm")
        @Expose
        private String tpm;
        @SerializedName("tpa")
        @Expose
        private String tpa;
        @SerializedName("tpp")
        @Expose
        private String tpp;
        @SerializedName("offReb")
        @Expose
        private String offReb;
        @SerializedName("defReb")
        @Expose
        private String defReb;
        @SerializedName("totReb")
        @Expose
        private String totReb;
        @SerializedName("assists")
        @Expose
        private String assists;
        @SerializedName("pFouls")
        @Expose
        private String pFouls;
        @SerializedName("steals")
        @Expose
        private String steals;
        @SerializedName("turnovers")
        @Expose
        private String turnovers;
        @SerializedName("blocks")
        @Expose
        private String blocks;
        @SerializedName("plusMinus")
        @Expose
        private String plusMinus;
        @SerializedName("min")
        @Expose
        private String min;

        public String getPoints() {
            return points;
        }

        public String getFgm() {
            return fgm;
        }

        public String getFga() {
            return fga;
        }

        public String getFgp() {
            return fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public String getFta() {
            return fta;
        }

        public String getFtp() {
            return ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public String getAssists() {
            return assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public String getMin() {
            return min;
        }

    }

    public class VTeamStats {

        @SerializedName("fastBreakPoints")
        @Expose
        private String fastBreakPoints;
        @SerializedName("pointsInPaint")
        @Expose
        private String pointsInPaint;
        @SerializedName("biggestLead")
        @Expose
        private String biggestLead;
        @SerializedName("secondChancePoints")
        @Expose
        private String secondChancePoints;
        @SerializedName("pointsOffTurnovers")
        @Expose
        private String pointsOffTurnovers;
        @SerializedName("longestRun")
        @Expose
        private String longestRun;
        @SerializedName("totals")
        @Expose
        private Totals totals;
        @SerializedName("leaders")
        @Expose
        private Leaders leaders;

        public String getFastBreakPoints() {
            return fastBreakPoints;
        }

        public String getPointsInPaint() {
            return pointsInPaint;
        }

        public String getBiggestLead() {
            return biggestLead;
        }

        public String getSecondChancePoints() {
            return secondChancePoints;
        }

        public String getPointsOffTurnovers() {
            return pointsOffTurnovers;
        }

        public String getLongestRun() {
            return longestRun;
        }

        public Totals getTotals() {
            return totals;
        }

        public Leaders getLeaders() {
            return leaders;
        }

    }

    }
