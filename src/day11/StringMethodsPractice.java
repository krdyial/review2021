package day11;

import java.util.Scanner;

public class StringMethodsPractice {
    public static void main(String[] args) {
       /* 1) Ask user to enter a password which has
		      a)At least two words with space between them
		      b)It should have at least 9 characters in total
              c)At least one upper case, one lower case, a number, and a special character
              d)At the beginning use one space, at the end use double space
	          Note: For every step use your password
	         Example for password: " Hey Come1?  "
                */

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me a password");
        String pass= scan.nextLine(); // " Hey Ahalia123h5 ? "




        // 2) Find the index of the initials of the words in your password+
        System.out.println("Index of H: "+pass.indexOf('H'));
        System.out.println("Index of A: "+pass.indexOf('A'));

        // 3) Find the last index of any character which is repeated in your password+
        System.out.println("Last index of h: "+pass.lastIndexOf('h'));

        //4) Replace * for all numbers in your password+
        System.out.println("All numbers turn asterix"+pass.replaceAll("\\d", "*"));

        // 5) Replace ? for all non-words in your password
        System.out.println("Replace ? for all non-words in your password: "+pass.replaceAll("\\W", "?"));

        // 6) Replace // for the second character of your password
        System.out.println("Replace // for the second character of your password"+pass.replace("H", "//"));

        // 7) Print your password without any space at the beginning and
        //    at the end of the password.
        System.out.println("All spaces cleaned: "+pass.trim());
        //    Find the length of your password before trim and after trim.
        System.out.println("Before trim: "+pass.length());
        System.out.println("After trim: "+pass.trim().length());
        // 8) Print your password on the console by starting from the 4th character
        System.out.println(pass.substring(3));
        System.out.println("With the last length: "+pass.substring(3, pass.length() - 1));

        // 9) Print the characters of your password from 2nd character to 7th character
        System.out.println("Between 2nd and 7th: "+pass.substring(1, 7));
        // 10)Print your password on the console like all characters in upper case
        System.out.println("All chars uppercase: "+pass.toUpperCase());
        // 11)Print your password on the console like all characters in lower case
        System.out.println("All char lowercase"+pass.toLowerCase());
    }
}
