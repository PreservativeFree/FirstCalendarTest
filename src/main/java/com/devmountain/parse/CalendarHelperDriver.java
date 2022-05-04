package com.devmountain.parse;

import com.devmountain.currentdate.WorldClock;

import java.util.Scanner;

public class CalendarHelperDriver {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the month and day of your birthday in the format as M/d/yyyy, e.g. 09/03/1997 for September 3, 1997");
        String birthdayString = scanner.nextLine();
        System.out.println("You entered: " + birthdayString);
        System.out.println("Do you want to continue? Yes or No?");
        String answer = scanner.nextLine();
        if(answer.startsWith("Y") || answer.startsWith("y")) {
            CalendarHelper calendarHelper = new CalendarHelper(birthdayString);
            calendarHelper.displayDaysRemainingToHolidaysAndBirthday();
        }
    }
}