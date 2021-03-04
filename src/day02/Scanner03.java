package day02;

import java.util.Scanner;

public class Scanner03 {
    /*
    Calculate the area and perimeter of a square
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give me the length of square");

        int length= scan.nextInt();
        System.out.println("Area of square: "+(length*length));
        System.out.println("Perimeter of square: "+(4*length));
        scan.close();

    }
}
