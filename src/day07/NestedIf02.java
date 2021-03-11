package day07;

import java.util.Scanner;

public class NestedIf02 {
    public static void main(String[] args) {
        /*
        if a number is even then check if it is divisible by 3 or not.
        if it is divisible by 3 output"Perfect even number", otherwise "good even number"
        if the number is odd then check if it is divisible by 3 or not
        if it is divisible by 3 "perfect odd number" otherwise "Good odd number"

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a number");
        int num= scan.nextInt();
        if (num%2==0){
            if ((num%3==0)){
                System.out.println("Perfect even number");
            }else{
                System.out.println("Good even number");
            }
        } else if (num%2!=0){
            if (num%3==0){
                System.out.println("Perfect odd number");
            } else{
                System.out.println("Good odd number");
            }
        }
        scan.close();
    }
}
