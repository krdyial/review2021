package day06;

import java.util.Scanner;

public class IfElseIf02 {
    public static void main(String[] args) {
        /* Ask user to give two integers
        if both of two integers are positive, output will be the sum of them
        if both of two integers are negative, output will be the multiplication of them
        otherwise, output will be " I can not add or multiply"
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer");
        int a= scan.nextInt();

        System.out.println("Give an integer");
        int b= scan.nextInt();

        if (a>0 && b>0){
            System.out.println(a+b);
        } else if (a<0 && b<0){
            System.out.println(a*b);
        } else{
            System.out.println("I can not add or multiply" );
        }
        scan.close();
    }
}
