package day04;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Ask user to enter two integer values. Write a Java Program to swap
two numbers by using the third variable.
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me to integers to swap");

        int a= scanner.nextInt();
        int b= scanner.nextInt();
        int c=0;
        System.out.println("Before swapping");
        System.out.println("a: "+a);
        System.out.println("b:"+ b);
        System.out.println("c:"+ c);
        c=a;
        a=b;
        b=c;
        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b:"+ b);
        System.out.println("c:"+ c);
        scanner.close();

    }
}
