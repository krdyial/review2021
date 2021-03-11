package day05;

import java.util.Scanner;

public class IfElseStatement01 {
    public static void main(String[] args) {
        //Ask user to give you an integer,
        // If integer is less than 10, print "You won! on the console
        //Otherwise print you lost on the console

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");

        int num = scan.nextInt();

        if (num<10){
            System.out.println("You won!");
        } else{
            System.out.println("You lost!");
        }
        scan.close();


    }


}