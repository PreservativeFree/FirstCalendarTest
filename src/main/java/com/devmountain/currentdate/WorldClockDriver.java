package com.devmountain.currentdate;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class WorldClockDriver {

    public static void main(String[] args) {
        //Get WorldClock class instance
        WorldClock worldClock = new WorldClock();

        //Instantiate some DateTimeFormatter with certain pattern
        DateTimeFormatter dateOnlyDTF = DateTimeFormatter.ofPattern("uuuu/MM/dd");
        DateTimeFormatter dateTimeDTF = DateTimeFormatter.ofPattern("uuuu/MM/dd HH:mm:ss");

        /*
         * Now use the worldClock object to get different date and time value
         * when print the date and time values, use DateTimeFormatter objects that you
         * create above to format the date and time values. After formatting the date
         * and time values, the output of date and time values become more user-friendly.
         */
        //LocalDate nowLocalDate = new LocalDate();
        LocalDate nowLocalDate = worldClock.getNowForDate();
        System.out.println("nowLocalDate=" + dateOnlyDTF.format(nowLocalDate));

        LocalDateTime nowLocalDateTime = worldClock.getNowForDateAndTime();
        System.out.println("nowLocalDateTime=" + dateTimeDTF.format(nowLocalDateTime));
        System.out.println();

        /*
         * Now use the NOW date value to check the value of "DayOfWeek", e.g. is today a Friday?
         */
        System.out.println("nowLocalDate.getDayOfWeek()=" + worldClock.getDayOfWeekForNow());
        System.out.println("nowLocalDate.getDayOfMonth()=" + worldClock.getDayOfMonthForNow());
        System.out.println("nowLocalDate.getDayOfYear()=" + worldClock.getDayOfYearForNow());
        System.out.println();

        /*
         * Now try to get NOW date and time for different cities in the world plus the associated zone ID value
         */
        ZonedDateTime nowZonedDateTimeForNewYork = worldClock.getNowDateTimeForNewYork();
        System.out.println("nowZonedDateTimeForNewYork=" + dateTimeDTF.format(nowZonedDateTimeForNewYork));
        System.out.println("nowZonedDateTimeForNewYork.getZone()=" + nowZonedDateTimeForNewYork.getZone());
        System.out.println();

        ZonedDateTime nowZonedDateTimeForLA = worldClock.getNowDateTimeForLA();
        System.out.println("nowZonedDateTimeForLA=" + dateTimeDTF.format(nowZonedDateTimeForLA));
        System.out.println("nowZonedDateTimeForLA.getZone()=" + nowZonedDateTimeForLA.getZone());
        System.out.println();

        ZonedDateTime nowZonedDateTimeForLondon = worldClock.getNowDateTimeForLondon();
        System.out.println("nowZonedDateTimeForLondon=" + dateTimeDTF.format(nowZonedDateTimeForLondon));
        System.out.println("nowZonedDateTimeForLondon.getZone()=" + nowZonedDateTimeForLondon.getZone());
        System.out.println();

        ZonedDateTime nowZonedDateTimeForMoscow = worldClock.getNowDateTimeForMoscow();
        System.out.println("nowZonedDateTimeForMoscow=" + dateTimeDTF.format(nowZonedDateTimeForMoscow));
        System.out.println("nowZonedDateTimeForMoscow.getZone()=" + nowZonedDateTimeForMoscow.getZone());
        System.out.println();

        ZonedDateTime nowZonedDateTimeForTokyo = worldClock.getNowDateTimeForTokyo();
        System.out.println("nowZonedDateTimeForTokyo=" + dateTimeDTF.format(nowZonedDateTimeForTokyo));
        System.out.println("nowZonedDateTimeForTokyo.getZone()=" + nowZonedDateTimeForTokyo.getZone());

    }
}
