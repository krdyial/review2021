package day14;

import java.util.Scanner;

public class While01 {
    public static void main(String[] args) {
        //Use while loop
        // factorial of the number

        Scanner scan = new Scanner(System.in);
        System.out.println("Give me an integer ");
        int num = scan.nextInt();

        int pro= 1;
        for (int i=1;i<=num;i++){
            pro= pro*i;
        }
        System.out.println(pro);

        //2.Way:
        int pro1=1;
        int k=1;
        while (k<=num) {
            pro1= pro1*k;
                    k++;
        }
        System.out.println(pro1);

        scan.close();
    }
}

