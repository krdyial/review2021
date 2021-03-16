package day15;

import java.util.Scanner;

public class Exercise05 {
    public static void main(String[] args) {
        /*
        Ask user to enter a String
Print the characters whose indexes are odd on the console
For example; Germany ==> e m n
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Enter s name");
        String name= scan.next();
        int i=0;
        do{
            if (i%2!=0){
                System.out.print(name.charAt(i));
            }
            i++;
        }while(i<name.length());//

    }
}
