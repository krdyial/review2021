package day11;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Ask user to enter an integer,
        if it is less than 10, calculate its square and print it on the console.
        If it is greater than 10 multiply it by 2 and print it on the console.
        Otherwise keep the number same and print it on the console.
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("give me an integer");
        int a= scan.nextInt();
        //If Else if
        if (a<10){
            System.out.println("The square :"+a*a);
        } else if (a>10){
            System.out.println("Multiply :"+ (2*a));
        }else{
            System.out.println("Keep number same:"+a);
        }
            // Ternary:
        Object result= a<10 ? (a*a):(a>10?2*a : a);
        System.out.println(result);

        scan.close();
    }
}
