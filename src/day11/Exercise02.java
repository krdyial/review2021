package day11;

import java.util.Scanner;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Ask user to enter his kid’s name,
        if the name contains “a” output will be “This name contains ‘a’.”
        if the name contains “z” output will be “This name contains ‘z’.”
        Otherwise, output will be “This name contains neither ‘a’ nor ‘z’.”
         */
        Scanner scan = new Scanner(System.in);
        System.out.println("Gve me an integer");
        String name= scan.nextLine().toLowerCase();

        Object result= name.contains("a") ? ("This name contains a") :
                                            (name.contains("z")?("This name contains z."):
                                                    ("This name contains neither ‘a’ nor ‘z’."));


        System.out.println(result);
        scan.close();
    }
}

