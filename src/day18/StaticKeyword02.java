package day18;

public class StaticKeyword02 {
    public static void main(String[] args) {
        /*
        i=12 -->static    k=13 --> non static
         */

        System.out.println(StaticKeyword01.i);//12
        StaticKeyword01 obj= new StaticKeyword01();
        System.out.println(obj.k); //13
        System.out.println(obj.i);//12


        //to access variable i, I did not create any object I used just class name
        //Because i is static
        // to access variable k, I created an obj.. Because k is non static

        //you can access to a static variable by using class name(recommended)
        //you can access to a static variable by using object as well but it is not recommended






    }
}
