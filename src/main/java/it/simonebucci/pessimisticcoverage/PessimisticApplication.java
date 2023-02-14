package it.simonebucci.pessimisticcoverage;

import java.text.SimpleDateFormat;
import java.util.Date;


public final class PessimisticApplication {

    public static String getHour(){
        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String res = sdf.format(date);
        System.out.println(res);
        return res;
    }



}