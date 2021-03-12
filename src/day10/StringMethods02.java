package day10;

public class StringMethods02 {
    public static void main(String[] args) {
        // startsWith() -> To check the initial
        //                      Returns boolean
        //                  do not use char as a parameter. should use String

        String str= "Tomorrow is another day";
        System.out.println(str.startsWith("T")); //true


        // If you want to check a specific index has a specific char
        // you can use startsWith() method
        System.out.println(str.startsWith("r",3));//false. Normally "o"
        System.out.println(str.startsWith("y",str.length()-1)); //True last char.
        System.out.println(str.startsWith("day", str.length()-3)); //True We can write a word as well.






    }
}
