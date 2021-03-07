package day04;

import java.util.Scanner;

public class IfStatement02 {
    public static void main(String[] args) {
        /*
        Type java code by using if else statement,
        Ask user if the password is "JavaLearner", output will be "The password is true"
        Otherwise output will be "The password is false"
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a password");
        String password= scan.next();
        String expected="JavaLearner";
        //Do not use for Strings == Because that is for primitive datas.
        // Because we need equality of Values and Addresses as well

        if (password.equals(expected)){
            System.out.println("The password is true");
        }else{
            System.out.println("The password is false");
        }
scan.close();

    }
}
