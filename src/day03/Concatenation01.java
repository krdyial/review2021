package day03;

public class Concatenation01 {
    public static void main(String[] args) {
        //Concatenation: to join Strings
        String str1= "Learn";
        String str2 = "Java";
        System.out.println("Concatenation: "+str1+str2);
        System.out.println(str1+" "+ str2);
        System.out.println(str1+2+3); //Learn23
        System.out.println(str1+(2+3));//Learn5 // Operation in paranthesis runs first.Then concatenate
        System.out.println(2+3+str2); //5Java  //Java reads left to right

        //By using str1 , str2, 2 and 3 print 6LearnJava-1 on the console

        System.out.println(2*3+str1+str2+(2-3)); //6LearnJava-1



    }
}
