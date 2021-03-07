package day04;

import java.util.Scanner;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Type a program like;
Ask user to enter two integer values, the first will be greater than the second.
The remainder when you divide the first by the second will be the width,
and the sum of the two numbers will be the length of a rectangle.
Then calculate the area and the perimeter of the rectangle, and print them
on the console.
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two integers");
        int a= scan.nextInt();
        int b= scan.nextInt();

        if (a>b){
            int width= a%b;
            int length= a+b;
            System.out.println("The area of rectangle: "+ (width*length));
        } else {
            System.out.println("Value of a should be greater than value b");
        }
scan.close();


    }
}
