package day11;

public class StringMethods01 {
    public static void main(String[] args) {
        /*
        endsWith()-> boolean.
         */
        String str="Today planing";
        System.out.println(str.endsWith("g"));//true
        System.out.println(str.endsWith("ning"));//true
       // System.out.println(str.endsWith('g'));// Do not use char we can use String here

        //substring-> extracts a specific part of a String
        //          -> it returns String

        System.out.println(str.substring(3));// starts to extract from index 3.3 is inclusive "ay planing"
        System.out.println(str.substring(7));//laning
        //System.out.println(str.substring(18)); // out of bound exception
        System.out.println(str);
        System.out.println(str.substring(13));//length of str =13. So last char is 0

        String s= "Learn Java";
        System.out.println(s.substring(1, 5)); //earn
        /*
        in substring(a,b) -> a is inclusive, b is exclusive.
         */
        System.out.println("Interesting: "+s.substring(3,3)); // Nothing. if the parameters are same
        System.out.println(str.substring(6,3));// beginning must be less than second. Run Time Error


    }
}
