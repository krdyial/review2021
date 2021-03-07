package day04;

import java.util.Scanner;

public class Operators01 {
    public static void main(String[] args) {
        /*
        Create two integer variables name them as a and b,
        Calculate the result of a+b*(a-a%b)
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two integers");

        int a= scan.nextInt();
        int b= scan.nextInt();

        System.out.println(a+b*(a-a%b)); //14

        scan.close();



    }
}
