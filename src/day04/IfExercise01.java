package day04;

import java.util.Scanner;

public class IfExercise01 {
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me a 4 digit number");

        int num= scanner.nextInt();

        int a= num%10; // you will get the last digit of number
        int b= num/1000; // you will get the first digit of the number
        System.out.println("Sum of a and b:"+(a+b));

    }
}
