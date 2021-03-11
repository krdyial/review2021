package day08;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Type java code by using ternary.
        Write a program to print absolute value of an integer entered by user.
         */

        Scanner scan= new Scanner(System.in);

        System.out.println("give me an integer");
        int num= scan.nextInt();
        int result= num<0 ? -num:num;
        System.out.println(result);
        scan.close();
    }
}

        class Exercise011 {
            public static void main(String[] args) {
                /*
                Type java code by using using ternary.
                Take values of length and width of a rectangle from user and
                 check if it is square or not.
                 */

                Scanner scan =  new Scanner(System.in);
                System.out.println("Give me  value of length");
                int length= scan.nextInt();
                System.out.println("Give me value of width");
                int width= scan.nextInt();

                String result= length==width?  "Square" :"Rectangle";
                System.out.println(result);
            scan.close();
            }

}
