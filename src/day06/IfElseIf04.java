package day06;

import java.util.Scanner;

public class IfElseIf04 {
    public static void main(String[] args) {
        /*
        Ask user to enter annual salary, if the salary is
        more than or equal to 80000 output will be "I accept the offer"
        between 60000 and 80000 output will be "I negotiate to increase"
        otherwise output will be "I do not accept the offer"
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter your annual salary");
        int salary= scan.nextInt();

        if (salary>=80000){
            System.out.println("I accept the offer");
        } else if (salary>60000 ){
            System.out.println("I negotiate to increase");
        } else{
            System.out.println("I do not accept the offer");
        }
        scan.close();
    }
}
