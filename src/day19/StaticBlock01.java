package day19;



public class StaticBlock01 {
   static int i;
   static double pi;
   static{
       i=12;
       pi=3.14;
       System.out.println("2nd static block");

   }

   static{
       System.out.println("1nd static block");
   }

   StaticBlock01(){
       System.out.println("I am constructor");
   }

    public static void main(String[] args) {
         /*
    Static block is a code block.
    We use Static block to initialize(Assigning first value) static variables
    Static Block are executed before all methods,before main method, before
    all constructors
    If you have more than one static blocks, Java runs the above (üsttekini) one first

     */
        System.out.println("I am method");
        StaticBlock01 obj= new StaticBlock01();

    }



}
