package com.github.ali77gh.unitools.data.Model;

/**
 * Created by ali on 10/4/18.
 */

public class Time {

    public int hour;
    public int min;

    public Time(int hour, int min) {
        this.hour = hour;
        this.min = min;
    }

    public static boolean Validator(int hour,int min){
        if (hour>24) return false;
        if (min >60) return false;
        if (hour<0) return false;
        if (min<0) return false;
        return true;
    }
}
