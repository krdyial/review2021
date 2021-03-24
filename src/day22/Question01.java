package day22;

import java.util.Arrays;

public class Question01 {
    public static void main(String[] args) {
        /*
        Write a Java program to remove a specific element from an array
         */

        int a[]= {12,11,23,7}; //I want to move 11
        int b[]= new int[a.length-1];


        int idx=0; // to select a specific element we created idx
        int k=0;
        for (int i=0;i<a.length;i++){
            if(idx==i){
                continue; // did not do anything in the loop. it goes directly to the increment part
            }
            b[k]=a[i];
            k++;
        }
        System.out.println(Arrays.toString(b)); //[11, 23, 7]




    }
}
