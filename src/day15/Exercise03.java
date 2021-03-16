package day15;

import java.util.Scanner;

public class Exercise03 {
    public static void main(String[] args) {

       /* Ask user to enter a number.
If the number is divisible by 10 then print "Won!" on the console
otherwise ask user to enter another number.
Use do-while loop.
         */
        Scanner scan= new Scanner(System.in);

        int a=1;

        do{
            System.out.println("Enter a number");
            a= scan.nextInt();
            if(a%10!=0){
                System.out.println("Enter another number");
            }
        }while(a%10!=0);
        System.out.println("You won");

        scan.close();


    }

}
