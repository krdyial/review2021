package day08;

import java.util.Scanner;

public class Ternary03 {
    public static void main(String[] args) {
        /*
        Use if- else and ternary
        ask user to enter two integers
        write a program to print the minimum one on the console
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me first integer");
        int a= scan.nextInt();
        System.out.println("Give me second integer");
        int b= scan.nextInt();

        if (a<=b){
            System.out.println(a);
        } else{
            System.out.println(b);
        }


        //ternary
        int result= a>=b ? b : a;
        System.out.println(result);

        scan.close();

    }
}
