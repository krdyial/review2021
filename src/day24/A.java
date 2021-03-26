package day24;

public class A {

   private int x=12;
   int y= 13; // y is a default access modifier.
             // to make something default do not type any access modifier

    public static void main(String[] args) {
        A obj = new A();
        System.out.println(obj.x); //12


    }
}
