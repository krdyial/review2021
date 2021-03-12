package day11;

public class StringMethods02 {
    public static void main(String[] args) {
        /*
        trim()-> delete the space characters from beginning and ending of the String
         */
        String str= " Java  ";// 1 space beginning 2 space at the end
        System.out.println(str.trim());//Java


        // indexOf() method->
        String s= "Java is Easy";
        System.out.println(s.indexOf('a')); // the first occurenceof the char  returns 1
        //we can use both String and chars
        System.out.println(s.indexOf("is")); //5 return is the index of the first character

        System.out.println(s.indexOf('a',4)); //9
        //After the 4th index what is the index of the 'a'

        System.out.println(s.indexOf("Easy", 0));//8

        // lastIndexOf()-> last occurance of a character
        String t= "Learn java";
        System.out.println(t.lastIndexOf('a'));//9



    }
}
