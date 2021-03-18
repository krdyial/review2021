package day16;

public class Constructors01 {
    //When you create a const. Java deletes the default one
    Constructors01(){

    }
    //Create a const. which has 1 parameter

    Constructors01(int price){

    }

    //Create a const. which has 2 parameters
    Constructors01(boolean b, char ch){

    }

    //Creeate a const. which has 2 parameters

    Constructors01(char ch, boolean b){

    }


    public static void main(String[] args) {
        /*
        Constructors:
        1- are used to create objects from classes
        2- is not method because a- const. have no return type
                                 b- const. name starts with upper case
        3- must be same with the class name, methods name may be same or different with the class name
        4- const. are inside the class body.

         */

        //To create an obj in Java class
        // With creating Java class, java automatically creates a constructor. It is not seen but
        // if you create a class you create constructor as well. It is invisible. Inside the constructor parantheses
        //there is no any parameteres.
        //When you create any const. Java deletes the default one
        //Create const. before main method, inside the class

         Constructors01           obj=       new             Constructors01();
        //Class name        //Obj. name    //new keyword       //Constructor, name is same with the class




    }
}
