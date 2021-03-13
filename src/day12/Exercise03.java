package day12;

public class Exercise03 {
    public static void main(String[] args) {
        /*
        Write a program to print odd counting numbers from
        200 to 33 on the console by using for-l
         */
        for (int i=200; i>=33;i--){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }
    }
}
