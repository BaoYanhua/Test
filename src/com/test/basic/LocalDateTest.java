package com.test.basic;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTest {

    public static void main(String[] args){
        Date d = new Date();
        LocalDate ld = LocalDate.now();
        int year = ld.getYear();
        int month = ld.getMonthValue();
        int today = ld.getDayOfMonth();

        System.out.println(year+"/"+month+"/"+today);

        calendarTest();
    }

    public static void calendarTest(){
        LocalDate date = LocalDate.now();
        int month = date.getMonthValue();
        int today = date.getDayOfMonth();

        date = date.minusDays(today - 1);
        DayOfWeek weekday = date.getDayOfWeek();
        int value = weekday.getValue();

        System.out.println("Mon Tue Wed Thu Fri Sat Sun");
        for(int i=1;i<value;i++){
            System.out.print("    ");
        }
        while(date.getMonthValue() == month){
            System.out.printf("%3d",date.getDayOfMonth());
            if(date.getDayOfMonth() == today)
                System.out.print("*");
            else
                System.out.print(" ");
            date = date.plusDays(1);
            if(date.getDayOfWeek().getValue() == 1)
                System.out.println();
        }
        if(date.getDayOfWeek().getValue() !=1)
            System.out.println();

    }
}
