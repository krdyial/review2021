package day20;

import java.util.Arrays;

public class Arrays02 {
    public static void main(String[] args) {
        //How to check if two arrays are equal to each other

        /*
        if same elements have same indexes then the arrays are
        equal to each other
        if arrays have different elements they cannot be equal to each other
        in the following example arr1 equal to arr2 but not equal to arr3
         */

        int arr1[]={2,7,6};
        int arr2[]={2,7,6};
        int arr3[]={6,2,7};

        //1.Way: Using loops
        int count =0;
        for (int i=0; i< arr1.length;i++){
            if (arr1[i]==arr2[i]){
                count++;
            }
        }
        String result= count==arr1.length? ("Arrays are same"):("Arrays are not same");
        System.out.println(result);

        //2.Way: Use equals method
        System.out.println(Arrays.equals(arr1, arr2));// true
        System.out.println(Arrays.equals(arr1, arr3)); //false





    }
}
