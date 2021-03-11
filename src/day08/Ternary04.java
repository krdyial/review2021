package day08;

import java.util.Scanner;

public class Ternary04 {

    public static void main(String[] args) {
        /*
        Ask user to enter a String
        if the String has 2 characters, output will be "It is valid for state abbreviations"
        otherwise, output will be "It is not valid for state abbreviations"
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a String");
        String str= scan.nextLine().toUpperCase();
        System.out.println("String: "+str);
        int length= str.length();
        String result = length==2? "It is valid for state abbreviations": "It is not valid for state abbreviations";
        System.out.println(result);
        scan.close();
    }
}
