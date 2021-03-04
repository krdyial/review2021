package day02;

import java.util.Scanner;

public class Scanner02 {
    public static void main(String[] args) {
        // Get two integers from user and print their sum on the console

        Scanner scan = new Scanner(System.in);

        System.out.println("Give me an integer");
        int num1= scan.nextInt();
        System.out.println("Give me one more integer");
        int num2= scan.nextInt();
        System.out.println("The sum of numbers: "+(num1+num2));
        System.out.println("Te product of numbers: "+(num1*num2));
        scan.close();
    }
}
