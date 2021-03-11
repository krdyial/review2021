package day05;

import java.util.Scanner;

public class IfElseStatement03 {
    public static void main(String[] args) {
        /*Ask user to give you the quantity of the products and the unit
         price of the product
          If the quantity is more than 1000, print "You got 10% discount"
          and print the total price on the console
          Otherwise, print "No discount" and print the total price on the console
         */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me quantity of product");

        int quantity= scan.nextInt(); //1000
        System.out.println("Give me price of product");
        int price= scan.nextInt(); //10
        int totalPrice= quantity*price;
        if (quantity>=1000){
            System.out.println("You got 10% discount. Total Price="+ (totalPrice*0.9));
        } else {
            System.out.println("No discount.Total Price= "+ (totalPrice));
        }
        // it prints double, because I used 0.9 as double so that is a double value.
        // If somedbody used two different data types, result would be printed as the largest data type.
        // In this qwuestion double is wider than integer I see the result as double


    }
}
