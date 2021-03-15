package day13;

import java.util.Scanner;

public class Question1_Important {
    public static void main(String[] args) {
        /* ask user a name which has 4 letters and print on the console reverse mode

         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Give ma 4 lettered name");
        String str= scan.nextLine().toLowerCase();

        char ch1= str.charAt(3);
        char ch2= str.charAt(2);
        char ch3= str.charAt(1);
        char ch4= str.charAt(0);

        System.out.println("Reversed name: "+ ch1+ch2+ch3+ch4);

        //2.Way: This way is for all situations and dynamic

        for (int i= str.length()-1; i>=0;i--){
            System.out.print(str.charAt(i));
        }

        scan.close();

    }

}
