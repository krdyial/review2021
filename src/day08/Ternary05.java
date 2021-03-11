package day08;

import java.util.Scanner;

public class Ternary05 {
    public static void main(String[] args) {
        /*
        Ask user to enter an integer
        if the number has 3 digits, output will be " has to digits"
        otherwise output will be "has no 3 digits"
         */

        //1.Way:
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");


        int num= scan.nextInt();
        String result= num>=100 && num<=999 ? "has 3 digits":"has no 3 digits";
        System.out.println(result);
        scan.close();

        //2.Way:
       /* Scanner scanner= new Scanner(System.in);
        System.out.println("Give me an integer");
        String str= scan.next();
        String result1= str.length()==3 ? "has 3 digits":"has no 3 digits";
        System.out.println(result1);
        */



    }
}
