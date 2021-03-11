package day07;

import java.util.Scanner;

public class NestedIf01 {
    public static void main(String[] args) {
        /*
        Ask user to enter gender and age
        If the gender is "male" and the age is less than 20 print "Boy", otherwise "Man"
        If the gender is "female" and the age is less tahn 20 print "Girl"
        otherwise print woman on the console
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me gender");
        String gender = scan.next().toLowerCase();
        System.out.println("Give me your age");
        int  age= scan.nextInt();

        if (gender.equalsIgnoreCase("male")){ // gender.equalsIgnoreCase
            if (age<20){
                System.out.println("Boy");
            }else{
                System.out.println("Man");
            }
        } else if (gender.equals("female")){
            if (age<20){
                System.out.println("Girl");
            } else{
                System.out.println("Woman");
            }
        } else{
            System.out.println("Undefined gender");
        }
        scan.close();
    }
}
