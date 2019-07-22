package com.company;

public class SecondsAndMinutes {
    private static final String INVALID_VALUE_MESSAGE = "Invalid value";  //constant declaration
    public static void main(String[] args){
       System.out.println(getDurationString(3660));
        System.out.println(getDurationString(61,128));
    }
    public static String getDurationString(int minutes, int seconds){
        if(minutes<0 ||seconds<0 ||seconds>59){
            return INVALID_VALUE_MESSAGE;
        }
        int hour = minutes/60;
        minutes = minutes%60;
        String time = hour + "h "+minutes+"m "+seconds+"s" ;
        return time;
    }

    public static String getDurationString(int seconds){
        if(seconds<0){
            return INVALID_VALUE_MESSAGE;
        }
        int minutes = seconds/60;
        seconds = seconds%60;
        return getDurationString(minutes, seconds);
    }

}
