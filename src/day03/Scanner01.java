package day03;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me your full name");

        //String str= scan.nextLine();// if you use nextLine return all String
        String str= scan.next();// if you use only next it prints only first word.
        System.out.println(str);
    }
}
