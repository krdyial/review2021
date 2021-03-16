package day14;

import java.util.Scanner;

public class While02 {
    public static void main(String[] args) {
        /*
        Type java code by using while loop,
        Write a program to count the factors of an integer
        Which is entered by user
        For example: 6 --> 1,2,3,6 ---> Print on the console 4
         */

        Scanner scan= new Scanner(System.in);
        System.out.println("Give me an integer");
        int a= scan.nextInt();
        int count =0;
        for (int i=1; i<=a; i++){
            if (a%i==0){
                System.out.print(i+" ");
                count++;
            }
        }
        System.out.println("Count: "+count);

        //2.Way:
         int k=1;
         int c=0;
        while(k<=a){
            if (a%k==0){
                System.out.println(k+" ");
                c++;
            }
            k++;
        }
        System.out.println("Count 2: "+ c);
            scan.close();
    }
}
