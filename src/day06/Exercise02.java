package day06;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Ask user ta enter any name of the week, then get second ,fourth,
and sixth letter of the day name and print them on the console,
in the same line.
For example; if the user enters “Monday” output will be “ody”
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me a name of the week");

        String name=scan.nextLine().toString().toLowerCase();
        System.out.println(""+name.toString().charAt(1)+name.toString().charAt(3)+name.toString().charAt(5));


    }
}
