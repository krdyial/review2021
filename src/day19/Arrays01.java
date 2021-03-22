package day19;

import java.util.Arrays;

public class Arrays01 {
    /*
    1- Arrays store multiple variables
    2- Arrays contain only one type of data types
    3- It store only primitives and referances (stack memory source)

    How to create an Array
     */
    public static void main(String[] args) {
        int arr[] = new int[4];
        System.out.println(Arrays.toString(arr));//[0, 0, 0, 0]

        // To assign a value for a specific element of an array
        arr[0]=11;
        System.out.println(Arrays.toString(arr));//[11, 0, 0, 0]
        arr[3]=14;
        System.out.println(Arrays.toString(arr));//[11, 0, 0, 14]

        arr[1]=12;
        System.out.println(Arrays.toString(arr));//[11, 12, 0, 14]
        arr[2]=13;
        System.out.println(Arrays.toString(arr)); //[11, 12, 13, 14]

        // How to get the number of the elements
        System.out.println(arr.length);//4

        //How to create ab array in short way:
        int brr[]={21,22,23,24};
        System.out.println(Arrays.toString(brr));

        //What happens if you try to use non-existing index in an array?
        // Answer: you do not get CTE
        //         you get RTE--> OutOfBoundsException
        //brr[4]=25;

        //How to print a specific element on the console

        System.out.println(brr[1]);//22
        System.out.println(brr[0]);//21
        System.out.println(brr[2]);//23
        System.out.println(brr[3]);//24


        //How to print all elements by using loop

        for (int i=0; i<brr.length;i++){
            System.out.print(brr[i]+" ");
        }




    }




}
