package day06;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Write a program to check if a year is leap year or not.
        if the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a year");

        int year = scan.nextInt();
        if (year%100==0){
            if (year%400==0){
                System.out.println(year+" is a leap year ");
            } else{
                System.out.println(year+" is not a leap year");
            }
        } else if (year%4==0){
            System.out.println(year+" is a leap year");
        } else{
            System.out.println(year+ " is not a leap year");
        }

        scan.close();
    }
}
