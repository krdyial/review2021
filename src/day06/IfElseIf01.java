package day06;

import java.util.Scanner;

public class IfElseIf01 {
    public static void main(String[] args) {
        //Ask user to enter an integer
        // if the number is greater than 0 print "Positive" on the console
        // if the number is less than 0 print "Negative" on the console
        // if the number is equal to 0 print "Neutral" on the console

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");

        int num= scan.nextInt();
        if (num>0){
            System.out.println("Positive");
        } else if (num<0){
            System.out.println("Negative");
        } else if (num==0){
            System.out.println("Neutral");
        }
        scan.close();
    }
}
