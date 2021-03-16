package day15;

import java.util.Scanner;

public class DoWhile05 {
    public static void main(String[] args) {
        /*
        ask user to enter first name
        if the initial is lower case print a message: " Make the initial upper case"
        if the initial is upper case print a message: "You did it right"

         */
        Scanner scan= new Scanner(System.in);
        String name="";

        do{
            System.out.println("Enter a name");
            name= scan.next();
            if (name.charAt(0)>='a' && name.charAt(0)<='z'){
                System.out.println("Make the initial upper case");
            }

        }while(!(name.charAt(0)>='A' && name.charAt(0)<='Z'));

        System.out.println("You did it right");
        scan.close();
    }
}
