package com.carter.khyri.statguess_nba.service.utils;

import com.carter.khyri.statguess_nba.R;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public final class CommonUtils {

    private CommonUtils() {}

    public static int getLogo(String triCode) {

        int resource = 0;
        switch (triCode) {
            case "ATL":
                resource = R.drawable.logo_atl;
                break;
            case "BKN":
                resource = R.drawable.logo_bkn;
                break;
            case "BOS":
                resource = R.drawable.logo_bos;
                break;
            case "CHA":
                resource = R.drawable.logo_cha;
                break;
            case "CHI":
                resource = R.drawable.logo_chi;
                break;
            case "CLE":
                resource = R.drawable.logo_cle;
                break;
            case "DAL":
                resource = R.drawable.logo_dal;
                break;
            case "DEN":
                resource = R.drawable.logo_den;
                break;
            case "DET":
                resource = R.drawable.logo_det;
                break;
            case "GSW":
                resource = R.drawable.logo_gsw;
                break;
            case "HOU":
                resource = R.drawable.logo_hou;
                break;
            case "IND":
                resource = R.drawable.logo_ind;
                break;
            case "LAC":
                resource = R.drawable.logo_lac;
                break;
            case "LAL":
                resource = R.drawable.logo_las;
                break;
            case "MEM":
                resource = R.drawable.logo_mem;
                break;
            case "MIA":
                resource = R.drawable.logo_mia;
                break;
            case "MIL":
                resource = R.drawable.logo_mil;
                break;
            case "MIN":
                resource = R.drawable.logo_min;
                break;
            case "NOP":
                resource = R.drawable.logo_nop;
                break;
            case "NYK":
                resource = R.drawable.logo_nyk;
                break;
            case "OKC":
                resource = R.drawable.logo_okc;
                break;
            case "ORL":
                resource = R.drawable.logo_orl;
                break;
            case "PHI":
                resource = R.drawable.logo_phi;
                break;
            case "PHX":
                resource = R.drawable.logo_phx;
                break;
            case "POR":
                resource = R.drawable.logo_por;
                break;
            case "SAC":
                resource = R.drawable.logo_sac;
                break;
            case "SAS":
                resource = R.drawable.logo_sas;
                break;
            case "TOR":
                resource = R.drawable.logo_tor;
                break;
            case "UTA":
                resource = R.drawable.logo_uta;
                break;
            case "WAS":
                resource = R.drawable.logo_was;
                break;

            default:
                resource = R.drawable.ic_basketball;
                break;
        }

        return resource;
    }

    public static String getDate() {
        String curDate;
        Date date = Calendar.getInstance().getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("yyyyMMdd");
        curDate = formatter.format(date);

        return curDate;
    }
}
