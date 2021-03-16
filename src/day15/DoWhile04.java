package day15;

import java.util.Scanner;

public class DoWhile04 {
    public static void main(String[] args) {
        /*
        Ask user enter an integer
        if the integer is even print on the console you won
        otherwise ask user to enter another integer
         */
        Scanner scan= new Scanner(System.in);


        int a= 1;
        do{
            System.out.println("Give me an integer");
            a=scan.nextInt();

        }while(a%2!=0);
        System.out.println("You won");
        scan.close();
    }

}
