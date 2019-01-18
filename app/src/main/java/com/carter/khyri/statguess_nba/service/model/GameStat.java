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

    public void setInternal(Internal internal) {
        this.internal = internal;
    }

    public BasicGameData getBasicGameData() {
        return basicGameData;
    }

    public void setBasicGameData(BasicGameData basicGameData) {
        this.basicGameData = basicGameData;
    }

    public Stats getStats() {
        return stats;
    }

    public void setStats(Stats stats) {
        this.stats = stats;
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

        public void setPersonId(String personId) {
            this.personId = personId;
        }

        public String getTeamId() {
            return teamId;
        }

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public boolean isIsOnCourt() {
            return isOnCourt;
        }

        public void setIsOnCourt(boolean isOnCourt) {
            this.isOnCourt = isOnCourt;
        }

        public String getPoints() {
            return points;
        }

        public void setPoints(String points) {
            this.points = points;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
        }

        public String getFgm() {
            return fgm;
        }

        public void setFgm(String fgm) {
            this.fgm = fgm;
        }

        public String getFga() {
            return fga;
        }

        public void setFga(String fga) {
            this.fga = fga;
        }

        public String getFgp() {
            return fgp;
        }

        public void setFgp(String fgp) {
            this.fgp = fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public void setFtm(String ftm) {
            this.ftm = ftm;
        }

        public String getFta() {
            return fta;
        }

        public void setFta(String fta) {
            this.fta = fta;
        }

        public String getFtp() {
            return ftp;
        }

        public void setFtp(String ftp) {
            this.ftp = ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public void setTpm(String tpm) {
            this.tpm = tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public void setTpa(String tpa) {
            this.tpa = tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public void setTpp(String tpp) {
            this.tpp = tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public void setOffReb(String offReb) {
            this.offReb = offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public void setDefReb(String defReb) {
            this.defReb = defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public void setTotReb(String totReb) {
            this.totReb = totReb;
        }

        public String getAssists() {
            return assists;
        }

        public void setAssists(String assists) {
            this.assists = assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public void setPFouls(String pFouls) {
            this.pFouls = pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public void setSteals(String steals) {
            this.steals = steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public void setTurnovers(String turnovers) {
            this.turnovers = turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public void setBlocks(String blocks) {
            this.blocks = blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public void setPlusMinus(String plusMinus) {
            this.plusMinus = plusMinus;
        }

        public String getDnp() {
            return dnp;
        }

        public void setDnp(String dnp) {
            this.dnp = dnp;
        }

        public SortKey getSortKey() {
            return sortKey;
        }

        public void setSortKey(SortKey sortKey) {
            this.sortKey = sortKey;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player__> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player__> players) {
            this.players = players;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player_____> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player_____> players) {
            this.players = players;
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

        public void setSeasonStageId(int seasonStageId) {
            this.seasonStageId = seasonStageId;
        }

        public String getSeasonYear() {
            return seasonYear;
        }

        public void setSeasonYear(String seasonYear) {
            this.seasonYear = seasonYear;
        }

        public String getGameId() {
            return gameId;
        }

        public void setGameId(String gameId) {
            this.gameId = gameId;
        }

        public boolean isIsGameActivated() {
            return isGameActivated;
        }

        public void setIsGameActivated(boolean isGameActivated) {
            this.isGameActivated = isGameActivated;
        }

        public int getStatusNum() {
            return statusNum;
        }

        public void setStatusNum(int statusNum) {
            this.statusNum = statusNum;
        }

        public int getExtendedStatusNum() {
            return extendedStatusNum;
        }

        public void setExtendedStatusNum(int extendedStatusNum) {
            this.extendedStatusNum = extendedStatusNum;
        }

        public String getStartTimeEastern() {
            return startTimeEastern;
        }

        public void setStartTimeEastern(String startTimeEastern) {
            this.startTimeEastern = startTimeEastern;
        }

        public String getStartTimeUTC() {
            return startTimeUTC;
        }

        public void setStartTimeUTC(String startTimeUTC) {
            this.startTimeUTC = startTimeUTC;
        }

        public String getEndTimeUTC() {
            return endTimeUTC;
        }

        public void setEndTimeUTC(String endTimeUTC) {
            this.endTimeUTC = endTimeUTC;
        }

        public String getStartDateEastern() {
            return startDateEastern;
        }

        public void setStartDateEastern(String startDateEastern) {
            this.startDateEastern = startDateEastern;
        }

        public String getClock() {
            return clock;
        }

        public void setClock(String clock) {
            this.clock = clock;
        }

        public boolean isIsBuzzerBeater() {
            return isBuzzerBeater;
        }

        public void setIsBuzzerBeater(boolean isBuzzerBeater) {
            this.isBuzzerBeater = isBuzzerBeater;
        }

        public boolean isIsPreviewArticleAvail() {
            return isPreviewArticleAvail;
        }

        public void setIsPreviewArticleAvail(boolean isPreviewArticleAvail) {
            this.isPreviewArticleAvail = isPreviewArticleAvail;
        }

        public boolean isIsRecapArticleAvail() {
            return isRecapArticleAvail;
        }

        public void setIsRecapArticleAvail(boolean isRecapArticleAvail) {
            this.isRecapArticleAvail = isRecapArticleAvail;
        }

        public boolean isHasGameBookPdf() {
            return hasGameBookPdf;
        }

        public void setHasGameBookPdf(boolean hasGameBookPdf) {
            this.hasGameBookPdf = hasGameBookPdf;
        }

        public boolean isIsStartTimeTBD() {
            return isStartTimeTBD;
        }

        public void setIsStartTimeTBD(boolean isStartTimeTBD) {
            this.isStartTimeTBD = isStartTimeTBD;
        }

        public Nugget getNugget() {
            return nugget;
        }

        public void setNugget(Nugget nugget) {
            this.nugget = nugget;
        }

        public String getAttendance() {
            return attendance;
        }

        public void setAttendance(String attendance) {
            this.attendance = attendance;
        }

        public GameDuration getGameDuration() {
            return gameDuration;
        }

        public void setGameDuration(GameDuration gameDuration) {
            this.gameDuration = gameDuration;
        }

        public Period getPeriod() {
            return period;
        }

        public void setPeriod(Period period) {
            this.period = period;
        }

        public VTeam getVTeam() {
            return vTeam;
        }

        public void setVTeam(VTeam vTeam) {
            this.vTeam = vTeam;
        }

        public HTeam getHTeam() {
            return hTeam;
        }

        public void setHTeam(HTeam hTeam) {
            this.hTeam = hTeam;
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

        public void setHours(String hours) {
            this.hours = hours;
        }

        public String getMinutes() {
            return minutes;
        }

        public void setMinutes(String minutes) {
            this.minutes = minutes;
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

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public String getTriCode() {
            return triCode;
        }

        public void setTriCode(String triCode) {
            this.triCode = triCode;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        public String getLoss() {
            return loss;
        }

        public void setLoss(String loss) {
            this.loss = loss;
        }

        public String getSeriesWin() {
            return seriesWin;
        }

        public void setSeriesWin(String seriesWin) {
            this.seriesWin = seriesWin;
        }

        public String getSeriesLoss() {
            return seriesLoss;
        }

        public void setSeriesLoss(String seriesLoss) {
            this.seriesLoss = seriesLoss;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public List<Linescore_> getLinescore() {
            return linescore;
        }

        public void setLinescore(List<Linescore_> linescore) {
            this.linescore = linescore;
        }

    }

    public class HTeam__ {

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

        public void setFastBreakPoints(String fastBreakPoints) {
            this.fastBreakPoints = fastBreakPoints;
        }

        public String getPointsInPaint() {
            return pointsInPaint;
        }

        public void setPointsInPaint(String pointsInPaint) {
            this.pointsInPaint = pointsInPaint;
        }

        public String getBiggestLead() {
            return biggestLead;
        }

        public void setBiggestLead(String biggestLead) {
            this.biggestLead = biggestLead;
        }

        public String getSecondChancePoints() {
            return secondChancePoints;
        }

        public void setSecondChancePoints(String secondChancePoints) {
            this.secondChancePoints = secondChancePoints;
        }

        public String getPointsOffTurnovers() {
            return pointsOffTurnovers;
        }

        public void setPointsOffTurnovers(String pointsOffTurnovers) {
            this.pointsOffTurnovers = pointsOffTurnovers;
        }

        public String getLongestRun() {
            return longestRun;
        }

        public void setLongestRun(String longestRun) {
            this.longestRun = longestRun;
        }

        public Totals_ getTotals() {
            return totals;
        }

        public void setTotals(Totals_ totals) {
            this.totals = totals;
        }

        public Leaders_ getLeaders() {
            return leaders;
        }

        public void setLeaders(Leaders_ leaders) {
            this.leaders = leaders;
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

        public void setPubDateTime(String pubDateTime) {
            this.pubDateTime = pubDateTime;
        }

        public String getXslt() {
            return xslt;
        }

        public void setXslt(String xslt) {
            this.xslt = xslt;
        }

        public String getEventName() {
            return eventName;
        }

        public void setEventName(String eventName) {
            this.eventName = eventName;
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

        public void setPoints(Points points) {
            this.points = points;
        }

        public Rebounds getRebounds() {
            return rebounds;
        }

        public void setRebounds(Rebounds rebounds) {
            this.rebounds = rebounds;
        }

        public Assists getAssists() {
            return assists;
        }

        public void setAssists(Assists assists) {
            this.assists = assists;
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

        public void setPoints(Points_ points) {
            this.points = points;
        }

        public Rebounds_ getRebounds() {
            return rebounds;
        }

        public void setRebounds(Rebounds_ rebounds) {
            this.rebounds = rebounds;
        }

        public Assists_ getAssists() {
            return assists;
        }

        public void setAssists(Assists_ assists) {
            this.assists = assists;
        }

    }

    public class Linescore {

        @SerializedName("score")
        @Expose
        private String score;

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

    }

    public class Linescore_ {

        @SerializedName("score")
        @Expose
        private String score;

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

    }

    public class Nugget {

        @SerializedName("text")
        @Expose
        private String text;

        public String getText() {
            return text;
        }

        public void setText(String text) {
            this.text = text;
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

        public void setCurrent(int current) {
            this.current = current;
        }

        public int getType() {
            return type;
        }

        public void setType(int type) {
            this.type = type;
        }

        public int getMaxRegular() {
            return maxRegular;
        }

        public void setMaxRegular(int maxRegular) {
            this.maxRegular = maxRegular;
        }

        public boolean isIsHalftime() {
            return isHalftime;
        }

        public void setIsHalftime(boolean isHalftime) {
            this.isHalftime = isHalftime;
        }

        public boolean isIsEndOfPeriod() {
            return isEndOfPeriod;
        }

        public void setIsEndOfPeriod(boolean isEndOfPeriod) {
            this.isEndOfPeriod = isEndOfPeriod;
        }

    }

    public class Player {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

    }

    public class Player_ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

    }

    public class Player__ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

    }

    public class Player___ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

    }

    public class Player____ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
        }

    }

    public class Player_____ {

        @SerializedName("personId")
        @Expose
        private String personId;

        public String getPersonId() {
            return personId;
        }

        public void setPersonId(String personId) {
            this.personId = personId;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player> players) {
            this.players = players;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player___> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player___> players) {
            this.players = players;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player_> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player_> players) {
            this.players = players;
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

        public void setValue(String value) {
            this.value = value;
        }

        public List<Player____> getPlayers() {
            return players;
        }

        public void setPlayers(List<Player____> players) {
            this.players = players;
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

        public void setName(int name) {
            this.name = name;
        }

        public int getPos() {
            return pos;
        }

        public void setPos(int pos) {
            this.pos = pos;
        }

        public int getPoints() {
            return points;
        }

        public void setPoints(int points) {
            this.points = points;
        }

        public int getMin() {
            return min;
        }

        public void setMin(int min) {
            this.min = min;
        }

        public int getFgm() {
            return fgm;
        }

        public void setFgm(int fgm) {
            this.fgm = fgm;
        }

        public int getFga() {
            return fga;
        }

        public void setFga(int fga) {
            this.fga = fga;
        }

        public int getFgp() {
            return fgp;
        }

        public void setFgp(int fgp) {
            this.fgp = fgp;
        }

        public int getFtm() {
            return ftm;
        }

        public void setFtm(int ftm) {
            this.ftm = ftm;
        }

        public int getFta() {
            return fta;
        }

        public void setFta(int fta) {
            this.fta = fta;
        }

        public int getFtp() {
            return ftp;
        }

        public void setFtp(int ftp) {
            this.ftp = ftp;
        }

        public int getTpm() {
            return tpm;
        }

        public void setTpm(int tpm) {
            this.tpm = tpm;
        }

        public int getTpa() {
            return tpa;
        }

        public void setTpa(int tpa) {
            this.tpa = tpa;
        }

        public int getTpp() {
            return tpp;
        }

        public void setTpp(int tpp) {
            this.tpp = tpp;
        }

        public int getOffReb() {
            return offReb;
        }

        public void setOffReb(int offReb) {
            this.offReb = offReb;
        }

        public int getDefReb() {
            return defReb;
        }

        public void setDefReb(int defReb) {
            this.defReb = defReb;
        }

        public int getTotReb() {
            return totReb;
        }

        public void setTotReb(int totReb) {
            this.totReb = totReb;
        }

        public int getAssists() {
            return assists;
        }

        public void setAssists(int assists) {
            this.assists = assists;
        }

        public int getPFouls() {
            return pFouls;
        }

        public void setPFouls(int pFouls) {
            this.pFouls = pFouls;
        }

        public int getSteals() {
            return steals;
        }

        public void setSteals(int steals) {
            this.steals = steals;
        }

        public int getTurnovers() {
            return turnovers;
        }

        public void setTurnovers(int turnovers) {
            this.turnovers = turnovers;
        }

        public int getBlocks() {
            return blocks;
        }

        public void setBlocks(int blocks) {
            this.blocks = blocks;
        }

        public int getPlusMinus() {
            return plusMinus;
        }

        public void setPlusMinus(int plusMinus) {
            this.plusMinus = plusMinus;
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
        private VTeam__ vTeam;
        @SerializedName("hTeam")
        @Expose
        private HTeam__ hTeam;
        @SerializedName("activePlayers")
        @Expose
        private List<ActivePlayer> activePlayers = null;

        public String getTimesTied() {
            return timesTied;
        }

        public void setTimesTied(String timesTied) {
            this.timesTied = timesTied;
        }

        public String getLeadChanges() {
            return leadChanges;
        }

        public void setLeadChanges(String leadChanges) {
            this.leadChanges = leadChanges;
        }

        public VTeam__ getVTeam() {
            return vTeam;
        }

        public void setVTeam(VTeam__ vTeam) {
            this.vTeam = vTeam;
        }

        public HTeam__ getHTeam() {
            return hTeam;
        }

        public void setHTeam(HTeam__ hTeam) {
            this.hTeam = hTeam;
        }

        public List<ActivePlayer> getActivePlayers() {
            return activePlayers;
        }

        public void setActivePlayers(List<ActivePlayer> activePlayers) {
            this.activePlayers = activePlayers;
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

        public void setPoints(String points) {
            this.points = points;
        }

        public String getFgm() {
            return fgm;
        }

        public void setFgm(String fgm) {
            this.fgm = fgm;
        }

        public String getFga() {
            return fga;
        }

        public void setFga(String fga) {
            this.fga = fga;
        }

        public String getFgp() {
            return fgp;
        }

        public void setFgp(String fgp) {
            this.fgp = fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public void setFtm(String ftm) {
            this.ftm = ftm;
        }

        public String getFta() {
            return fta;
        }

        public void setFta(String fta) {
            this.fta = fta;
        }

        public String getFtp() {
            return ftp;
        }

        public void setFtp(String ftp) {
            this.ftp = ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public void setTpm(String tpm) {
            this.tpm = tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public void setTpa(String tpa) {
            this.tpa = tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public void setTpp(String tpp) {
            this.tpp = tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public void setOffReb(String offReb) {
            this.offReb = offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public void setDefReb(String defReb) {
            this.defReb = defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public void setTotReb(String totReb) {
            this.totReb = totReb;
        }

        public String getAssists() {
            return assists;
        }

        public void setAssists(String assists) {
            this.assists = assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public void setPFouls(String pFouls) {
            this.pFouls = pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public void setSteals(String steals) {
            this.steals = steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public void setTurnovers(String turnovers) {
            this.turnovers = turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public void setBlocks(String blocks) {
            this.blocks = blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public void setPlusMinus(String plusMinus) {
            this.plusMinus = plusMinus;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
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

        public void setPoints(String points) {
            this.points = points;
        }

        public String getFgm() {
            return fgm;
        }

        public void setFgm(String fgm) {
            this.fgm = fgm;
        }

        public String getFga() {
            return fga;
        }

        public void setFga(String fga) {
            this.fga = fga;
        }

        public String getFgp() {
            return fgp;
        }

        public void setFgp(String fgp) {
            this.fgp = fgp;
        }

        public String getFtm() {
            return ftm;
        }

        public void setFtm(String ftm) {
            this.ftm = ftm;
        }

        public String getFta() {
            return fta;
        }

        public void setFta(String fta) {
            this.fta = fta;
        }

        public String getFtp() {
            return ftp;
        }

        public void setFtp(String ftp) {
            this.ftp = ftp;
        }

        public String getTpm() {
            return tpm;
        }

        public void setTpm(String tpm) {
            this.tpm = tpm;
        }

        public String getTpa() {
            return tpa;
        }

        public void setTpa(String tpa) {
            this.tpa = tpa;
        }

        public String getTpp() {
            return tpp;
        }

        public void setTpp(String tpp) {
            this.tpp = tpp;
        }

        public String getOffReb() {
            return offReb;
        }

        public void setOffReb(String offReb) {
            this.offReb = offReb;
        }

        public String getDefReb() {
            return defReb;
        }

        public void setDefReb(String defReb) {
            this.defReb = defReb;
        }

        public String getTotReb() {
            return totReb;
        }

        public void setTotReb(String totReb) {
            this.totReb = totReb;
        }

        public String getAssists() {
            return assists;
        }

        public void setAssists(String assists) {
            this.assists = assists;
        }

        public String getPFouls() {
            return pFouls;
        }

        public void setPFouls(String pFouls) {
            this.pFouls = pFouls;
        }

        public String getSteals() {
            return steals;
        }

        public void setSteals(String steals) {
            this.steals = steals;
        }

        public String getTurnovers() {
            return turnovers;
        }

        public void setTurnovers(String turnovers) {
            this.turnovers = turnovers;
        }

        public String getBlocks() {
            return blocks;
        }

        public void setBlocks(String blocks) {
            this.blocks = blocks;
        }

        public String getPlusMinus() {
            return plusMinus;
        }

        public void setPlusMinus(String plusMinus) {
            this.plusMinus = plusMinus;
        }

        public String getMin() {
            return min;
        }

        public void setMin(String min) {
            this.min = min;
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

        public void setTeamId(String teamId) {
            this.teamId = teamId;
        }

        public String getTriCode() {
            return triCode;
        }

        public void setTriCode(String triCode) {
            this.triCode = triCode;
        }

        public String getWin() {
            return win;
        }

        public void setWin(String win) {
            this.win = win;
        }

        public String getLoss() {
            return loss;
        }

        public void setLoss(String loss) {
            this.loss = loss;
        }

        public String getSeriesWin() {
            return seriesWin;
        }

        public void setSeriesWin(String seriesWin) {
            this.seriesWin = seriesWin;
        }

        public String getSeriesLoss() {
            return seriesLoss;
        }

        public void setSeriesLoss(String seriesLoss) {
            this.seriesLoss = seriesLoss;
        }

        public String getScore() {
            return score;
        }

        public void setScore(String score) {
            this.score = score;
        }

        public List<Linescore> getLinescore() {
            return linescore;
        }

        public void setLinescore(List<Linescore> linescore) {
            this.linescore = linescore;
        }

    }

    public class VTeam__ {

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

        public void setFastBreakPoints(String fastBreakPoints) {
            this.fastBreakPoints = fastBreakPoints;
        }

        public String getPointsInPaint() {
            return pointsInPaint;
        }

        public void setPointsInPaint(String pointsInPaint) {
            this.pointsInPaint = pointsInPaint;
        }

        public String getBiggestLead() {
            return biggestLead;
        }

        public void setBiggestLead(String biggestLead) {
            this.biggestLead = biggestLead;
        }

        public String getSecondChancePoints() {
            return secondChancePoints;
        }

        public void setSecondChancePoints(String secondChancePoints) {
            this.secondChancePoints = secondChancePoints;
        }

        public String getPointsOffTurnovers() {
            return pointsOffTurnovers;
        }

        public void setPointsOffTurnovers(String pointsOffTurnovers) {
            this.pointsOffTurnovers = pointsOffTurnovers;
        }

        public String getLongestRun() {
            return longestRun;
        }

        public void setLongestRun(String longestRun) {
            this.longestRun = longestRun;
        }

        public Totals getTotals() {
            return totals;
        }

        public void setTotals(Totals totals) {
            this.totals = totals;
        }

        public Leaders getLeaders() {
            return leaders;
        }

        public void setLeaders(Leaders leaders) {
            this.leaders = leaders;
        }

    }

    }
