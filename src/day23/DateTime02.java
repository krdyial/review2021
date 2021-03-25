package day23;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

public class DateTime02 {

    public static void main(String[] args) {
        // How to update date format -->  2021-03-25 default

        LocalDate date = LocalDate.now();
        System.out.println(date);

        DateTimeFormatter dtf= DateTimeFormatter.ofPattern("dd-MM-yyyy"); // uppercase N because m stands for minute
        System.out.println(dtf.format(date)); //25-03-2021

        DateTimeFormatter dtf1= DateTimeFormatter.ofPattern("dd-MMM-yy"); // MMM stands for the name of months(first 3 digits)
        System.out.println(dtf1.format(date)); // 25-Mar-21
        System.out.println(dtf1.format(date.plusMonths(5))); //25-Mar-21

        //How to update time format
        LocalTime time= LocalTime.now();

        //if you use lower case "h"s, Java uses 12 hours system(AM/PM)
        DateTimeFormatter dtf2= DateTimeFormatter.ofPattern("hh:mm");
        System.out.println(dtf2.format(time)); //10:56
        System.out.println(dtf2.format(time.plusHours(7))); // 05:58

        DateTimeFormatter dtf3= DateTimeFormatter.ofPattern("HH:mm");
        System.out.println(dtf3.format(time.plusHours(7))); //17:58 --> 24 hours system

        //How to get local time

        System.out.println(LocalTime.now(ZoneId.of("Turkey"))); //12:59:41.207







    }
}
