package day14;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Type java code by using while loop,
Write a program that prompts the user to input a positive integer.
It should then print the multiplication table of that number.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");
        int a= scan.nextInt();

        int i=1;
        int count=0;
        while(i<=a){
            if (a%i==0){
                System.out.print(i+" ");
                count ++;
            }
            i++;
        }
        System.out.println("Number :"+count);
        scan.close();
    }
}
