package day23;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateTime01 {

    public static void main(String[] args) {
        //to get current date

        System.out.println(LocalDate.now()); //2021-03-25

        //How to get future dates

        LocalDate date1= LocalDate.now();
        System.out.println(date1.plusDays(5)); //2021-03-30 You will add days
        System.out.println(date1.plusMonths(5)); //2021-08-25 you will add month
        System.out.println(date1.plusYears(10)); //  2031-03-25 you will years

        //how to get past dates

        System.out.println(date1.minusDays(5)); //  2021-03-20 you will go to past days
        System.out.println(date1.minusMonths(5)); //  2020-10-25  5 months ago


        //How to get current time

        System.out.println(LocalTime.now()); //10:42:05.247  --> 247 nano seconds

        // To get future times

        LocalTime time1 = LocalTime.now();
        System.out.println(time1); //10:43:38.460
        System.out.println(time1.plusSeconds(50)); //10:44:28.460
        System.out.println(time1.plusHours(10)); //  20:45:12.832

        //to get past times

        System.out.println(time1.minusHours(1)); // 20:45:12.832

        //to get date and time together

        System.out.println(LocalDateTime.now());//2021-03-25T10:47:32.810 --> T stands for time



    }
}
