package day20;

import java.util.Arrays;

public class Arrays01 {
    public static void main(String[] args) {
        //To check if a specific element is in the array

        int arr[]= {3,2,4,3,5};

        //First make sort and then use binary search to find specific element
        // binarySearch returns index of the element
        //  if you are looking for  a non existing element in an Array
        // you will get get negative result

        Arrays.sort(arr);
        System.out.println(Arrays.binarySearch(arr, 4));
        System.out.println(Arrays.binarySearch(arr, 3)); // There are two 3
                                                            // It finds the index, which is the  elements index

        System.out.println(Arrays.binarySearch(arr,10)); // -6 10 is not existing in the array
        System.out.println(Arrays.binarySearch(arr,0)); // -1



    }
}
