package com.numhero.server.utils;

import java.text.DateFormat;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class DateUtils {

    public static void main(String[] args) {

        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(new Date());

//        System.out.println("DAY_OF_YEAR = " + cal.get(Calendar.DAY_OF_YEAR));
//
//        System.out.println("YEAR = " + cal.get(Calendar.YEAR));

    }

    public static int getDayOfYear(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(Calendar.DAY_OF_YEAR);
    }

    public static int getYear(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(Calendar.YEAR);
    }

    public static int getWeekOfYear(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(Calendar.WEEK_OF_YEAR);
    }

    public static int getMonthOfYear(Date date) {
        GregorianCalendar cal = new GregorianCalendar();
        cal.setTime(date);
        return cal.get(Calendar.MONTH);
    }

    public static Date fromString(String value) {
        GregorianCalendar cal = new GregorianCalendar();
        try {
            return DateFormat.getDateInstance().parse(value);
        } catch (ParseException e) {
            return null;
        }
    }
}
