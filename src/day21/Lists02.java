package day21;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Lists02 {
    public static void main(String[] args) {
        //to check if two lists are equal each other

        List<Integer> l1= new ArrayList<>();
        l1.add(11);
        l1.add(12);
        l1.add(13);
        System.out.println(l1);

        List<Integer> l2 = new ArrayList<>();
        l2.add(13);
        l2.add(11);
        l2.add(12);
        System.out.println(l2);
        List<Integer> l3 = new ArrayList<>();
        l3.add(13);
        l3.add(11);
        l3.add(12);
        System.out.println(l3);

        System.out.println(l1.equals(l2));// false
        System.out.println(l2.equals(l3)); // true
        // order of the elements is important in lists.
        // If order and elements are same then lists are same otherwise lists are not equal

        // to convert a list to an array

        Integer arr[] = l1.toArray(new Integer[0]);
        System.out.println(Arrays.toString(arr)); // [11, 12, 13]

        // to convert an Array to a List

        String s[]= {"a", "c","b"};

        List<String>l4= Arrays.asList(s);
        System.out.println(l4); //[a, c, b]


    }
}
