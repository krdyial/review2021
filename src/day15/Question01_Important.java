package day15;


import java.util.Scanner;

public class Question01_Important {
    public static void main(String[] args) {
        /*
        Ask user to enter first name, last name and SSN
        Then type a program which makes
        a- initials of the first name and last name in uppercase
        other chars will be in lower case
        b- all chars except last 4 chars of the SSN "*".
        For example; Jason Kidd  ****5678
         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Give me your first name");
        String fn= scan.next();
        System.out.println("Give me your last name");
        String ln= scan.next();
        System.out.println("Give me your SSN");
        String ssn= scan.next();

        String inF= fn.substring(0,1).toUpperCase();
        fn= fn.substring(1).toLowerCase();
        fn= inF+fn;

        String inL= ln.substring(0,1).toUpperCase();
        ln= ln.substring(1).toLowerCase();
        ln= inL+ln;

        String ssnFirstPart= ssn.substring(0,ssn.length()-4).replaceAll("\\w","*");
        String ssnLastPart= ssn.substring(ssn.length()-4,ssn.length());
        ssn= ssnFirstPart+ssnLastPart;

        System.out.println(fn+" "+ln+" "+ssn);



        scan.close();

    }
}
