
package day15;

import java.util.Scanner;

public class Exercise04 {
    public static void main(String[] args) {
        /*
    Ask user to enter a name.
If the name contains the letter ‘a’ then print "Won!" on the console
otherwise ask user to enter another name.
Use do-while loop.
     */
        Scanner scan= new Scanner(System.in);
        System.out.println("Enter a name");
        String name="";

        do{

            name= scan.next().toLowerCase();
            if (!name.contains("a")){
                System.out.println("Enter another name");
            }
        }while(!name.contains("a"));
        System.out.println("You won aga!");
        scan.close();
    }

}
