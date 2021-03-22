package day20;

import java.util.Arrays;

public class MultiDimensionalArrays {
    public static void main(String[] args) {

        //To create multidimensional array

        int mda[][] = new int[3][2];

        //To print multidimensional array on the console
        System.out.println(Arrays.deepToString(mda)); //[[0, 0], [0, 0], [0, 0]]

        // To add elements into multidimensional array

        mda[0][0]=5;
        System.out.println(Arrays.deepToString(mda)); ////[[5, 0], [0, 0], [0, 0]]

        mda [1][0]=7;
        System.out.println(Arrays.deepToString(mda)); //[[5, 0], [7, 0], [0, 0]]

        mda[2][1]=11;
        System.out.println(Arrays.deepToString(mda)); // [[5, 0], [7, 0], [0, 11]]

        mda[0][1]=6;
        mda[1][1]=8;
        mda[2][0]=9;
        System.out.println(Arrays.deepToString(mda)); // [[5, 6], [7, 8], [9, 11]]

        // To print an element of outer array:
        System.out.println(Arrays.toString(mda[0])); //[5, 6]
        System.out.println(Arrays.toString(mda[1])); //[7, 8]
        System.out.println(Arrays.toString(mda[2])); //[9, 11]

        //To print the elements of inner array one by one
        System.out.println( mda[0][1]); //6
        System.out.println( mda[2][1]); // 11

        // To create a  multidimensional array in short way:

        int mda1[][]= {{3,4,5},{6},{7,8}};
        System.out.println(Arrays.deepToString(mda1)); //[[3, 4, 5], [6], [7, 8]]

    }
}
