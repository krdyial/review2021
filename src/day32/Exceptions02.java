package day32;

public class Exceptions02 {
    static String s3; //==> static variable. not instance variable

    public static void main(String[] args) {
        String s1="";
        System.out.println(s1.length()); //0 ==> length() returns number of characters in a String

        String s2= null;
        //System.out.println(s2.length()); //if you try to get the length of the "null"
                                        // object you will get Null Pointer Exception

        //System.out.println(s3.length()); //Because default value for Strings in Java is null
                                         // You will get Null Pointer Exception



    }
}
