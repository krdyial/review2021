package day09;

import java.util.Scanner;

public class NestedTernary01 {
    public static void main(String[] args) {
        //Find the output for name = Ali and name= Veli
        String name= "Ali";
        String result = name.length()>3 ? name.contains("i")?"Veli":"No name" :"Ali";
        System.out.println(result);

        /*
        CAN BE AN INTERVIEW QUESTION
        Write a program to check if a year is leap year or not.
        if the year is divisible by 100 then it must be divisible by 400.
        If a year is not divisible by 100 then it must be divisible by 4.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a year");
        int year= scan.nextInt();

        String result1= (year%100==0) ? (year%400==0 ? "Leap":"Not leap") :
                                        (year%4==0? "Leap":"Not leap");

        System.out.println(result1);

            scan.close();

    }
}
