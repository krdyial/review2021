package day15;

import java.util.Scanner;

public class DoWhile06 {
    public static void main(String[] args) {
        /*ask user his/ her first name
        if the length of name is greater than 6 print "Long name"
        otherwise print "normal name" and finish loop
         */
        Scanner scan= new Scanner(System.in);
        String name="";
        do{
            System.out.println("Enter your name");
            name= scan.next();
            if (name.length()>6){
                System.out.println(name+ " is a long name");
            }
        }while(name.length()>6);
        System.out.println(name+ " is normal name");
    }
}
