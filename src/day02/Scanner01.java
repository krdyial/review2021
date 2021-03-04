package day02;

import java.util.Scanner;

public class Scanner01 {
    public static void main(String[] args) {
        //Scanner class is used to get data from user
        // To get data from user we have 3 steps
        //1. Step: create an object from Scanner class

        Scanner scan = new Scanner(System.in); //System.in to get data in my scripts

        //2. Step: send message to the user
        System.out.println("Please give me an integer");

        //3. Step: get the variable from user and send it to the container
        int num = scan.nextInt();
        System.out.println(num+3); // System.out Shows the data to the outside of scripts
        scan.close();
    }
}
