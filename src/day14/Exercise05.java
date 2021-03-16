package day14;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        Type java code by using while loop,
Write a program that prompts the user to input an integer.
It should then find sum of the digits of that number.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");
        int a= scan.nextInt();

        int i=0;
        while(a!=0){
            int last=a%10;
            i=i+last;
            a=a/10;

        }
        System.out.println(i+" ");

scan.close();

    }
}
