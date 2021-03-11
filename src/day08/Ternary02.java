package day08;

import java.util.Scanner;

public class Ternary02 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Give a number");


        int num= scan.nextInt();
        String result = num%2==0? "The integer is even":"The integer is odd";
        System.out.println(result);

        //2.Way: We can put ternary in system.out.println
        System.out.println(num%2==0? "The integer is even":"The integer is odd");

        scan.close();
    }
}
