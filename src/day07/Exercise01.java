package day07;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Ask user to enter a password
If the initial of the password is uppercase then check if it is ‘A’ or not. If it is ‘A’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
If the initial of the password is lowercase then check if it is ‘z’ or not. If it is ‘z’ the output will be
“Valid Password” otherwise the output will be “Invalid Password”
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a password");
        String pass= scan.nextLine();
        char initial = pass.charAt(0);

        if ('A'<=initial && initial<='Z'){
            if (initial=='A'){
                System.out.println("Valid Password");
            } else{
                System.out.println("Invalid Password");
            }
        } else if ('a'<=initial && initial<='z'){
            if (initial=='z'){
                System.out.println("Valid Password");
            } else{
                System.out.println("Invalid Password");
            }
        }
        scan.close();
    }
}
