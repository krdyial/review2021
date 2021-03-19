package day17;

import java.util.Scanner;

public class MethodCreation02 {
    public static void main(String[] args) {
     /* Create a method outside of the main method
        Ask user to enter two numbers
        ASk user which operation he/she wants to do
        Print the result after doing operation which user asked
        Call the method from inside the main method

      */
        simpleCalculator();



    }
    public  static void simpleCalculator(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Give me two integers");
        int a= scan.nextInt();
        int b= scan.nextInt();
        System.out.println("Give me an operation");
        char op= scan.next().charAt(0);

        switch (op){
            case '+':
                System.out.println("The sum is :"+ (a+b));
                break;
            case '-':
                System.out.println("The diffrence is: "+(a-b));
                break;
            case '*':
                System.out.println("The multiplication is :"+ (a*b));
                break;
            case '/':
                System.out.println("The division is: "+(a/b));
                break;
            default:
                System.out.println("Please use correct operation signal");
        }
            scan.close();
    }


}
