package day04;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        /*
        Type java code by using if statement. When you enter the initial of the day of a week,
output should be all possible names of the days.
For example; if the initial is ’S’ output should be “Saturday or Sunday”
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an initial");

        char init= scan.nextLine().charAt(0);

        if (init=='S'){
            System.out.println("Sunday or Saturday");
        } if (init=='M'){
            System.out.println("Monday");
        } if(init=='T'){
            System.out.println("Thursday or Tuesday");
        } if (init=='W') {
            System.out.println("Wednesday");
        } if (init=='F'){
            System.out.println("Friday");
        }
        scan.close();
    }
    }

