package day15;

import java.util.Scanner;

public class DoWhile03 {
    public static void main(String[] args) {
         /*
    ask user to enter a number
    if the number  user entered is less than 10 print "Won" on the console
    otherwise ask user yo enter a number again

     */

        Scanner scan= new Scanner(System.in);

        int i=1;
        do{
            System.out.println("Enter a number");
            i= scan.nextInt();
        }while(i>=10);
        System.out.println("Won");

        scan.close();
    }
}
