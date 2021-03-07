package day04;

import java.util.Scanner;

public class Operators03 {

    public static void main(String[] args) {
        /*
        Ask user to enter two integer values. Write a Java Program
        to swap two numebrs by using the third variable
        a=3, b=5 after swapping a=5, b=3
         */
       //Answer: We will not use third container

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two integers to swap");

        int a= scan.nextInt();
        int b= scan.nextInt();

        a= a+b;
        b= a-b;
        a= a-b;
        System.out.println("a:"+a);
        System.out.println("b: "+b);

        scan.close();



    }
}
