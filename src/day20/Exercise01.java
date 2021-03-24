package day20;

import java.util.Arrays;

public class Exercise01 {
    public static void main(String[] args) {
        /*
        Find the sum of all elements in the multi dimensional array { {1,2,3}, {4,5,6} }
         */
        int arr[][]={{1,2,3},{4,5,6}};
        System.out.println(Arrays.deepToString(arr));

        int sum=0;
        for (int[] w: arr){
            for (int a:w){
                sum=sum+a;
            }
        }
        System.out.println("The sum of multidimensional array :"+sum);
    }
}
