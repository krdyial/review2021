package day09;

import java.util.Scanner;

public class SwitchStatement01 {
    public static void main(String[] args) {
        /*
            if the user pressed 1,2,3 the program will print the number that is pressed;
            otherwise program will print "Not allowed"
            Use if-else-if and switch
         */
        int a=2;
         if (a==1){
             System.out.println("1");
         } else if(a==2){
             System.out.println("2");
         } else if (a==3){
             System.out.println("3");
         }else{
             System.out.println("Not allowed");
         }


         //2.way:
        switch (a){
            case 1:
                System.out.println("One");
                break;
            case 2:
                System.out.println("Two");
                break;
            case 3:
                System.out.println("Three");
                break;
            default:
                System.out.println("Not allowed");
        }

    }

}
