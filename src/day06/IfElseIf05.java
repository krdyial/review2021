package day06;

import java.util.Random;
import java.util.Scanner;

public class IfElseIf05 {
    public static void main(String[] args) {
        /*
        if the age is less than 13 output will be "Should not work"
        if the age is greater than 65 output will be "Retired"
        Otherwise "Should work"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("give me an age");
        int age= scan.nextInt();

        if (age<0){
            System.out.println("This value is not suitable for age");
        } else if (age<13){
            System.out.println("Should not work");
        } else if (age>65){
            System.out.println("Retired");
        } else{
            System.out.println("Should work");
        }

        scan.close();
    }
}
