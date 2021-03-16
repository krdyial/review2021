package day15;

public class Exercise02 {
    public static void main(String[] args) {
        /*
        Write a program to print numbers from 20 to 6 on the console by using do-while loop.
         */

        int i=20;
        do{
            System.out.print(i+" ");
            i--;
        }while(i>=1);

        //Write a program to print numbers which are divisible by 5 between 1 and 100 on the console
        //by using do-while loop.
        System.out.println();
        int k= 1;
        do{
            if (k%5==0){
                System.out.print(k+" ");
            }
            k++;
        }while(k<=100);
        System.out.println();
         /*
        Write a program to print letters from c to m on the console by using do-while loop.
         */

        char ch='c';

        do{
            System.out.print(ch+" ");
            ch++;
        }while(ch<='m');


    }
}
