package day06;


import java.util.Locale;
import java.util.Scanner;

public class Exercie01 {
    public static void main(String[] args) {
         /*
    Ask user to enter his/her age and gender. If the age is more than 65 and the gender is male
then output will be “Hey man you retired!” else output will be “No need to work”
     */

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me your age and gender");
        int age = scan.nextInt();
        String gender= scan.next();
        String expected= "male";

        if (age>65 && gender.equals(expected)){
            System.out.println("Hey man you retired!");
        } else{
            System.out.println("No need to work");
        }
    }



}
