package day04;

import day02.Scanner01;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Ask user to enter two integer values. Write a Java Program to swap
two numbers without using the third variable.
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two integers");

        int a= scan.nextInt();
        int b= scan.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a:"+a);
        System.out.println("b: "+b);
    }
}
