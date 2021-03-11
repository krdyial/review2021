package day08;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("give me an integer");
        int num= scan.nextInt();
        int result= num<0 ? -num:num;
        System.out.println(result);
    }
}
