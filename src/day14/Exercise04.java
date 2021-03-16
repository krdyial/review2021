package day14;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        /*
        Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print factorial of that number.
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");
        int a= scan.nextInt();

        int i=1;
        int pro=1;
        while(i<=a){
            pro=i*pro;
            i++;
        }
        System.out.println(pro);
        scan.close();
    }
}
