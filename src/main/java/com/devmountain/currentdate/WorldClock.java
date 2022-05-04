package com.devmountain.currentdate;

import java.time.*;
import java.time.format.DateTimeFormatter;
public class WorldClock {

    public LocalDate getNowForDate() {
        LocalDate localDate = LocalDate.now();
        return localDate;
    }

    public LocalDateTime getNowForDateAndTime() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime;
    }

    public DayOfWeek getDayOfWeekForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfWeek();
    }

    public int getDayOfMonthForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfMonth();
    }

    public int getDayOfYearForNow() {
        LocalDateTime localDateTime = LocalDateTime.now();
        return localDateTime.getDayOfYear(); // x/365
    }

    public ZonedDateTime getNowDateTimeForNewYork() {
        return getNowDatetimeWithZoneId("America/New_York");
    }

    public ZonedDateTime getNowDateTimeForLA() {
        return getNowDatetimeWithZoneId("America/Los_Angeles");
    }

    public ZonedDateTime getNowDateTimeForLondon() {
        return getNowDatetimeWithZoneId("Europe/London");
    }

    public ZonedDateTime getNowDateTimeForMoscow() {
        return getNowDatetimeWithZoneId("Europe/Moscow");
    }

    public ZonedDateTime getNowDateTimeForTokyo() {
        return getNowDatetimeWithZoneId("Asia/Tokyo");
    }

    private ZonedDateTime getNowDatetimeWithZoneId(String zoneId) {
        ZonedDateTime now = ZonedDateTime.now();
        ZonedDateTime zoneDateTime = now.withZoneSameInstant(ZoneId.of(zoneId));
        return zoneDateTime;
    }

}
