package day10;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Ask user ta enter one of the ‘U’, ’S’, and ‘A’.
        Then type a program by using “switch statement” to print
        “United” for ‘U’, ”States” for ’S’, and “America” for ‘A’
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a char");
        char ch= scan.next().toUpperCase().charAt(0);
        switch(ch){
            case 'U':
                System.out.println("United");
                break;
            case 'S':
                System.out.println("States");
                break;
            case 'A':
                System.out.println("America");
                break;
            default:
                System.out.println("Please enter a suitable char");
        }
            scan.close();
    }
}
