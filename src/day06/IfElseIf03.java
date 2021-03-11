package day06;

import java.util.Scanner;

public class IfElseIf03 {
    public static void main(String[] args) {
        /*
        A school has following rules for grading system:
        1. Below 50 - D  2.50- 60 -C  3. 60 to 80 - B  4. Above 80- A
        Ask user to enter marks and print the corresponding grade
         */

        Scanner scanner= new Scanner(System.in);
        System.out.println("Give me your mark");
        int mark= scanner.nextInt();
       /* if (mark<50){
            System.out.println("D");
        } else if (50<=mark && mark<60){
            System.out.println("C");
        } else if (60<=mark && mark<80){
            System.out.println("B");
        }else if (80<=mark && mark<100){
            System.out.println("A");
        }*/

        if (mark<50){
            System.out.println("D");
        } else if (mark<60){
            System.out.println("C");
        } else if (mark<80){
            System.out.println("B");
        }else if (mark<=100){
            System.out.println("A");
        }
        scanner.close();
    }

}
