package day04;

import java.util.Scanner;

public class Operators02 {
    public static void main(String[] args) {
        /*
        ASk user to enter two integer values. Write a Java Program
        to swap two numebrs by using the third variable
        a=3, b=5 after swapping a=5, b=3
         */
        //Answer: For swapping we need one more value(container) to change the values.
        //
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me two integers to swap");

        int a= scan.nextInt();
        int b= scan.nextInt();
        int c;
        System.out.println("Before swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+ b);
        c=a; // A
        a=b;
        b=c;

        System.out.println("After swapping");
        System.out.println("a: "+a);
        System.out.println("b: "+ b);
        System.out.println("c:"+ c);

        scan.close();







    }


}


