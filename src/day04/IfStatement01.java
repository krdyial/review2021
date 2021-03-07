package day04;

import java.util.Scanner;

public class IfStatement01 {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer");

        int a = scan.nextInt();
        if (a>0){
            System.out.println("Positive");
        } if (a<0){
            System.out.println("Negative");
        } if(a==0){
            System.out.println("Neither positive nor negative");
        }
    scan.close();
    }
}
