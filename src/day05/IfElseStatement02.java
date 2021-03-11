package day05;

import java.util.Scanner;

public class IfElseStatement02 {
    public static void main(String[] args) {
        //Ask useer to give you a char. If the char is the same with initial of your first name
        // print "You got it!"
        //Otherwise print "Try again"


        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a char ");

        char init= scan.nextLine().charAt(0);

        if (init=='A'){
            System.out.println("You got it");
        } else{
            System.out.println("Try again");
        }

        scan.close();


    }
}

