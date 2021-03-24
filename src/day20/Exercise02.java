package day20;

import java.util.Arrays;

public class Exercise02 {
    public static void main(String[] args) {
        /*
    Find the product of the last elements in the array elements of the
  given multi dimensional array { {1,2,3}, {4,5}, {6} }
     */

        int arr[][]= {{1,2,3}, {4,5}, {6}};
        System.out.println(Arrays.deepToString(arr));
        int a=0;
        int pro=1;
        for (int[]w:arr){
            a= w[w.length-1];
            pro=pro*a;
        }

        System.out.println("Product of last elements :"+ pro);


    }
}
