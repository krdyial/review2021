package day14;

import java.util.Scanner;

public class While03_Important {
    public static void main(String[] args) {
        /*
        Type Java code by using while loop,
        Write a program that prompts the user to input an integer
        it should then find sum of the digits of that number
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");
        int a =scan.nextInt();

        int i=1;
        int k=0;
        while(a!=0){
            int ld= a%10;
            k=k+ld;
            a=a/10;


        }
        System.out.println(k);


    }
}
