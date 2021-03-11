package day08;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {
        // Ask user to enter an integer
        // If the integer is greater than 10 print "Good" on the console
        // Otherwise, print "Bad" on the console

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");

        int num= scan.nextInt();

        //1.way:
        if (num>10){
            System.out.println("Good");
        } else{
            System.out.println("Bad");
        }

        //2.Way:
        // if the result is String we create the result as a String container
        String result= num>10 ? "Good": "Bad";
        System.out.println(result);
        System.out.println("===============");
        Object res= num>10 ? 21: "Bad";
        System.out.println(res);
    }
}
