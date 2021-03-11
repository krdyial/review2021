package day09;

import java.util.Scanner;

public class SwitchStatement02 {
    public static void main(String[] args) {
        /*
        Ask user to enter a letter
        If the letter is 'A' print o the console "first letter"
        If the letter is 'B' print o the console "second letter"
        If the letter is 'C' print o the console "third letter"
        If the letter is 'D' print o the console "forth letter"
        Otherwise print on the console "What kind of letter is this?"

         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a letter");

        char ch= scan.next().toUpperCase().charAt(0);
        System.out.println(ch);

        switch(ch){
            case 'A':
                System.out.println("first letter");
                break;
            case 'B':
                System.out.println("second letter");
                break;
            case 'C':
                System.out.println("third letter");
                break;
            case 'D':
                System.out.println("forth letter");
                break;
            default:
                System.out.println("What kind of letter is this?");
        }
        scan.close();
    }
}
