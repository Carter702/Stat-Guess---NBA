package com.carter.khyri.statguess_nba.models;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;



public class Games {

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

    public void setNumGames(int numGames) {
        this.numGames = numGames;
    }

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
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
        @SerializedName("arena")
        @Expose
        private Arena arena;
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
        @SerializedName("tickets")
        @Expose
        private Tickets tickets;
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
        @SerializedName("watch")
        @Expose
        private Watch watch;

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

        public Arena getArena() {
            return arena;
        }

        public void setArena(Arena arena) {
            this.arena = arena;
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

        public Tickets getTickets() {
            return tickets;
        }

        public void setTickets(Tickets tickets) {
            this.tickets = tickets;
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

        public Watch getWatch() {
            return watch;
        }

        public void setWatch(Watch watch) {
            this.watch = watch;
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

    public class HTeam_ {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class HTeam__ {

        @SerializedName("streams")
        @Expose
        private List<Stream___> streams = null;
        @SerializedName("broadcasters")
        @Expose
        private List<Broadcaster_> broadcasters = null;

        public List<Stream___> getStreams() {
            return streams;
        }

        public void setStreams(List<Stream___> streams) {
            this.streams = streams;
        }

        public List<Broadcaster_> getBroadcasters() {
            return broadcasters;
        }

        public void setBroadcasters(List<Broadcaster_> broadcasters) {
            this.broadcasters = broadcasters;
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

    public class National {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class National_ {

        @SerializedName("streams")
        @Expose
        private List<Stream_> streams = null;
        @SerializedName("broadcasters")
        @Expose
        private List<Object> broadcasters = null;

        public List<Stream_> getStreams() {
            return streams;
        }

        public void setStreams(List<Stream_> streams) {
            this.streams = streams;
        }

        public List<Object> getBroadcasters() {
            return broadcasters;
        }

        public void setBroadcasters(List<Object> broadcasters) {
            this.broadcasters = broadcasters;
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

    public class Stream {

        @SerializedName("streamType")
        @Expose
        private String streamType;
        @SerializedName("isOnAir")
        @Expose
        private boolean isOnAir;
        @SerializedName("doesArchiveExist")
        @Expose
        private boolean doesArchiveExist;
        @SerializedName("isArchiveAvailToWatch")
        @Expose
        private boolean isArchiveAvailToWatch;
        @SerializedName("streamId")
        @Expose
        private String streamId;
        @SerializedName("duration")
        @Expose
        private int duration;

        public String getStreamType() {
            return streamType;
        }

        public void setStreamType(String streamType) {
            this.streamType = streamType;
        }

        public boolean isIsOnAir() {
            return isOnAir;
        }

        public void setIsOnAir(boolean isOnAir) {
            this.isOnAir = isOnAir;
        }

        public boolean isDoesArchiveExist() {
            return doesArchiveExist;
        }

        public void setDoesArchiveExist(boolean doesArchiveExist) {
            this.doesArchiveExist = doesArchiveExist;
        }

        public boolean isIsArchiveAvailToWatch() {
            return isArchiveAvailToWatch;
        }

        public void setIsArchiveAvailToWatch(boolean isArchiveAvailToWatch) {
            this.isArchiveAvailToWatch = isArchiveAvailToWatch;
        }

        public String getStreamId() {
            return streamId;
        }

        public void setStreamId(String streamId) {
            this.streamId = streamId;
        }

        public int getDuration() {
            return duration;
        }

        public void setDuration(int duration) {
            this.duration = duration;
        }

    }

    public class Stream_ {

        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("isOnAir")
        @Expose
        private boolean isOnAir;
        @SerializedName("streamId")
        @Expose
        private String streamId;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isIsOnAir() {
            return isOnAir;
        }

        public void setIsOnAir(boolean isOnAir) {
            this.isOnAir = isOnAir;
        }

        public String getStreamId() {
            return streamId;
        }

        public void setStreamId(String streamId) {
            this.streamId = streamId;
        }

    }

    public class Stream__ {

        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("isOnAir")
        @Expose
        private boolean isOnAir;
        @SerializedName("streamId")
        @Expose
        private String streamId;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isIsOnAir() {
            return isOnAir;
        }

        public void setIsOnAir(boolean isOnAir) {
            this.isOnAir = isOnAir;
        }

        public String getStreamId() {
            return streamId;
        }

        public void setStreamId(String streamId) {
            this.streamId = streamId;
        }

    }

    public class Stream___ {

        @SerializedName("language")
        @Expose
        private String language;
        @SerializedName("isOnAir")
        @Expose
        private boolean isOnAir;
        @SerializedName("streamId")
        @Expose
        private String streamId;

        public String getLanguage() {
            return language;
        }

        public void setLanguage(String language) {
            this.language = language;
        }

        public boolean isIsOnAir() {
            return isOnAir;
        }

        public void setIsOnAir(boolean isOnAir) {
            this.isOnAir = isOnAir;
        }

        public String getStreamId() {
            return streamId;
        }

        public void setStreamId(String streamId) {
            this.streamId = streamId;
        }

    }

    public class Tickets {

        @SerializedName("mobileApp")
        @Expose
        private String mobileApp;
        @SerializedName("desktopWeb")
        @Expose
        private String desktopWeb;
        @SerializedName("mobileWeb")
        @Expose
        private String mobileWeb;
        @SerializedName("leagGameInfo")
        @Expose
        private String leagGameInfo;
        @SerializedName("leagTix")
        @Expose
        private String leagTix;

        public String getMobileApp() {
            return mobileApp;
        }

        public void setMobileApp(String mobileApp) {
            this.mobileApp = mobileApp;
        }

        public String getDesktopWeb() {
            return desktopWeb;
        }

        public void setDesktopWeb(String desktopWeb) {
            this.desktopWeb = desktopWeb;
        }

        public String getMobileWeb() {
            return mobileWeb;
        }

        public void setMobileWeb(String mobileWeb) {
            this.mobileWeb = mobileWeb;
        }

        public String getLeagGameInfo() {
            return leagGameInfo;
        }

        public void setLeagGameInfo(String leagGameInfo) {
            this.leagGameInfo = leagGameInfo;
        }

        public String getLeagTix() {
            return leagTix;
        }

        public void setLeagTix(String leagTix) {
            this.leagTix = leagTix;
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

    public class VTeam_ {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class VTeam__ {

        @SerializedName("streams")
        @Expose
        private List<Stream__> streams = null;
        @SerializedName("broadcasters")
        @Expose
        private List<Broadcaster> broadcasters = null;

        public List<Stream__> getStreams() {
            return streams;
        }

        public void setStreams(List<Stream__> streams) {
            this.streams = streams;
        }

        public List<Broadcaster> getBroadcasters() {
            return broadcasters;
        }

        public void setBroadcasters(List<Broadcaster> broadcasters) {
            this.broadcasters = broadcasters;
        }

    }

    public class Video {

        @SerializedName("regionalBlackoutCodes")
        @Expose
        private String regionalBlackoutCodes;
        @SerializedName("canPurchase")
        @Expose
        private boolean canPurchase;
        @SerializedName("isLeaguePass")
        @Expose
        private boolean isLeaguePass;
        @SerializedName("isNationalBlackout")
        @Expose
        private boolean isNationalBlackout;
        @SerializedName("isTNTOT")
        @Expose
        private boolean isTNTOT;
        @SerializedName("isVR")
        @Expose
        private boolean isVR;
        @SerializedName("tntotIsOnAir")
        @Expose
        private boolean tntotIsOnAir;
        @SerializedName("isNextVR")
        @Expose
        private boolean isNextVR;
        @SerializedName("isNBAOnTNTVR")
        @Expose
        private boolean isNBAOnTNTVR;
        @SerializedName("isMagicLeap")
        @Expose
        private boolean isMagicLeap;
        @SerializedName("isOculusVenues")
        @Expose
        private boolean isOculusVenues;
        @SerializedName("streams")
        @Expose
        private List<Stream> streams = null;
        @SerializedName("deepLink")
        @Expose
        private List<DeepLink> deepLink = null;

        public String getRegionalBlackoutCodes() {
            return regionalBlackoutCodes;
        }

        public void setRegionalBlackoutCodes(String regionalBlackoutCodes) {
            this.regionalBlackoutCodes = regionalBlackoutCodes;
        }

        public boolean isCanPurchase() {
            return canPurchase;
        }

        public void setCanPurchase(boolean canPurchase) {
            this.canPurchase = canPurchase;
        }

        public boolean isIsLeaguePass() {
            return isLeaguePass;
        }

        public void setIsLeaguePass(boolean isLeaguePass) {
            this.isLeaguePass = isLeaguePass;
        }

        public boolean isIsNationalBlackout() {
            return isNationalBlackout;
        }

        public void setIsNationalBlackout(boolean isNationalBlackout) {
            this.isNationalBlackout = isNationalBlackout;
        }

        public boolean isIsTNTOT() {
            return isTNTOT;
        }

        public void setIsTNTOT(boolean isTNTOT) {
            this.isTNTOT = isTNTOT;
        }

        public boolean isIsVR() {
            return isVR;
        }

        public void setIsVR(boolean isVR) {
            this.isVR = isVR;
        }

        public boolean isTntotIsOnAir() {
            return tntotIsOnAir;
        }

        public void setTntotIsOnAir(boolean tntotIsOnAir) {
            this.tntotIsOnAir = tntotIsOnAir;
        }

        public boolean isIsNextVR() {
            return isNextVR;
        }

        public void setIsNextVR(boolean isNextVR) {
            this.isNextVR = isNextVR;
        }

        public boolean isIsNBAOnTNTVR() {
            return isNBAOnTNTVR;
        }

        public void setIsNBAOnTNTVR(boolean isNBAOnTNTVR) {
            this.isNBAOnTNTVR = isNBAOnTNTVR;
        }

        public boolean isIsMagicLeap() {
            return isMagicLeap;
        }

        public void setIsMagicLeap(boolean isMagicLeap) {
            this.isMagicLeap = isMagicLeap;
        }

        public boolean isIsOculusVenues() {
            return isOculusVenues;
        }

        public void setIsOculusVenues(boolean isOculusVenues) {
            this.isOculusVenues = isOculusVenues;
        }

        public List<Stream> getStreams() {
            return streams;
        }

        public void setStreams(List<Stream> streams) {
            this.streams = streams;
        }

        public List<DeepLink> getDeepLink() {
            return deepLink;
        }

        public void setDeepLink(List<DeepLink> deepLink) {
            this.deepLink = deepLink;
        }

    }

    public class Watch {

        @SerializedName("broadcast")
        @Expose
        private Broadcast broadcast;

        public Broadcast getBroadcast() {
            return broadcast;
        }

        public void setBroadcast(Broadcast broadcast) {
            this.broadcast = broadcast;
        }

    }

    public class Arena {

        @SerializedName("name")
        @Expose
        private String name;
        @SerializedName("isDomestic")
        @Expose
        private boolean isDomestic;
        @SerializedName("city")
        @Expose
        private String city;
        @SerializedName("stateAbbr")
        @Expose
        private String stateAbbr;
        @SerializedName("country")
        @Expose
        private String country;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public boolean isIsDomestic() {
            return isDomestic;
        }

        public void setIsDomestic(boolean isDomestic) {
            this.isDomestic = isDomestic;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getStateAbbr() {
            return stateAbbr;
        }

        public void setStateAbbr(String stateAbbr) {
            this.stateAbbr = stateAbbr;
        }

        public String getCountry() {
            return country;
        }

        public void setCountry(String country) {
            this.country = country;
        }

    }

    public class Audio {

        @SerializedName("national")
        @Expose
        private National_ national;
        @SerializedName("vTeam")
        @Expose
        private VTeam__ vTeam;
        @SerializedName("hTeam")
        @Expose
        private HTeam__ hTeam;

        public National_ getNational() {
            return national;
        }

        public void setNational(National_ national) {
            this.national = national;
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

    }

    public class Broadcast {

        @SerializedName("broadcasters")
        @Expose
        private Broadcasters broadcasters;
        @SerializedName("video")
        @Expose
        private Video video;
        @SerializedName("audio")
        @Expose
        private Audio audio;

        public Broadcasters getBroadcasters() {
            return broadcasters;
        }

        public void setBroadcasters(Broadcasters broadcasters) {
            this.broadcasters = broadcasters;
        }

        public Video getVideo() {
            return video;
        }

        public void setVideo(Video video) {
            this.video = video;
        }

        public Audio getAudio() {
            return audio;
        }

        public void setAudio(Audio audio) {
            this.audio = audio;
        }

    }

    public class Broadcaster {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class Broadcaster_ {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class Broadcasters {

        @SerializedName("national")
        @Expose
        private List<National> national = null;
        @SerializedName("canadian")
        @Expose
        private List<Canadian> canadian = null;
        @SerializedName("vTeam")
        @Expose
        private List<VTeam_> vTeam = null;
        @SerializedName("hTeam")
        @Expose
        private List<HTeam_> hTeam = null;
        @SerializedName("spanish_hTeam")
        @Expose
        private List<Object> spanishHTeam = null;
        @SerializedName("spanish_vTeam")
        @Expose
        private List<Object> spanishVTeam = null;
        @SerializedName("spanish_national")
        @Expose
        private List<Object> spanishNational = null;

        public List<National> getNational() {
            return national;
        }

        public void setNational(List<National> national) {
            this.national = national;
        }

        public List<Canadian> getCanadian() {
            return canadian;
        }

        public void setCanadian(List<Canadian> canadian) {
            this.canadian = canadian;
        }

        public List<VTeam_> getVTeam() {
            return vTeam;
        }

        public void setVTeam(List<VTeam_> vTeam) {
            this.vTeam = vTeam;
        }

        public List<HTeam_> getHTeam() {
            return hTeam;
        }

        public void setHTeam(List<HTeam_> hTeam) {
            this.hTeam = hTeam;
        }

        public List<Object> getSpanishHTeam() {
            return spanishHTeam;
        }

        public void setSpanishHTeam(List<Object> spanishHTeam) {
            this.spanishHTeam = spanishHTeam;
        }

        public List<Object> getSpanishVTeam() {
            return spanishVTeam;
        }

        public void setSpanishVTeam(List<Object> spanishVTeam) {
            this.spanishVTeam = spanishVTeam;
        }

        public List<Object> getSpanishNational() {
            return spanishNational;
        }

        public void setSpanishNational(List<Object> spanishNational) {
            this.spanishNational = spanishNational;
        }

    }

    public class Canadian {

        @SerializedName("shortName")
        @Expose
        private String shortName;
        @SerializedName("longName")
        @Expose
        private String longName;

        public String getShortName() {
            return shortName;
        }

        public void setShortName(String shortName) {
            this.shortName = shortName;
        }

        public String getLongName() {
            return longName;
        }

        public void setLongName(String longName) {
            this.longName = longName;
        }

    }

    public class DeepLink {

        @SerializedName("broadcaster")
        @Expose
        private String broadcaster;
        @SerializedName("regionalMarketCodes")
        @Expose
        private String regionalMarketCodes;
        @SerializedName("iosApp")
        @Expose
        private String iosApp;
        @SerializedName("androidApp")
        @Expose
        private String androidApp;
        @SerializedName("desktopWeb")
        @Expose
        private String desktopWeb;
        @SerializedName("mobileWeb")
        @Expose
        private String mobileWeb;

        public String getBroadcaster() {
            return broadcaster;
        }

        public void setBroadcaster(String broadcaster) {
            this.broadcaster = broadcaster;
        }

        public String getRegionalMarketCodes() {
            return regionalMarketCodes;
        }

        public void setRegionalMarketCodes(String regionalMarketCodes) {
            this.regionalMarketCodes = regionalMarketCodes;
        }

        public String getIosApp() {
            return iosApp;
        }

        public void setIosApp(String iosApp) {
            this.iosApp = iosApp;
        }

        public String getAndroidApp() {
            return androidApp;
        }

        public void setAndroidApp(String androidApp) {
            this.androidApp = androidApp;
        }

        public String getDesktopWeb() {
            return desktopWeb;
        }

        public void setDesktopWeb(String desktopWeb) {
            this.desktopWeb = desktopWeb;
        }

        public String getMobileWeb() {
            return mobileWeb;
        }

        public void setMobileWeb(String mobileWeb) {
            this.mobileWeb = mobileWeb;
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
}




