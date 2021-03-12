package day10;

public class StringMethods01 {
    public static void main(String[] args) {
    /*
    length-> returns integer
    equals -> returns boolean
    toUpperCase-> returns String
    toLowerCase -> returns String
    contains -> boolean
    equalsIgnoreCase -> returns boolean
    charAt() -> returns char

     */

    // replace->  to change a char/chars in a String. Returns String(updated)
        // not only char also we can change word (String)

    String str= "Easy, Java is Easy";
        System.out.println(str.replace('a', 'x')); // Exsy, Jxvx is Exsy
        System.out.println(str); // Easy, Java is Easy
        // replace is a temprory change. If you want to change str completly
       // str= str.replace('a','x');
        //System.out.println(str);
        System.out.println(str.replace("Easy", "Hard")); //Hard, Java is Hard
        // To delete for ex. 'a' we can use ""
        System.out.println(str.replace("a","")); //Esy, Jv is Esy



        //replaceAll-> makes same thing with replace()
        //  1- replaceAll() doesn't accept char as parameters
        //  2- replaceAll() accepts "regex" as parameter

        System.out.println(str.replaceAll("J","L")); //Easy, Lava is Easy
        //System.out.println(str.replaceAll('J','L'));// We can not use char parameters in replaceAll()
        //regex: stands for Regular Expressions

        String m= "Java 123 ?!@$_";
        // \\w means a->z and A->Z and 0->9 and _

        System.out.println(m.replaceAll("\\w","*")); //**** *** ?!@$*
        // \\W means characters EXCEPT a->z and A->Z and 0-9 and _
        System.out.println(m.replaceAll("\\W", "*")); //Java*123*****_

        // --> \\d -> means 0-9

        System.out.println(m.replaceAll("\\d","*"));// Java *** ?!@$_
        System.out.println(m.replaceAll("\\D","*")); //*****123*****

        //  \\s -> is for white space   \\S ->except of white space
        System.out.println(m.replaceAll("\\s","-->"));//Java-->123-->?!@$_"
        System.out.println(m.replaceAll("\\S","?")); //???? ??? ?????




    }

}
