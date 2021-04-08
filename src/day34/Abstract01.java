package day34;

public abstract class Abstract01 {
        // means in Turkish -> Soyut

    /*
    1- to make a class abstract type abstract between access modifier and class keyword
    2- you can not create an object from abstract classes
    3- we use abstract classes  as  mandatory or optional "to-do" list for child classes
       "abstract" methods are mandatory, concrete methods are optional

    4- Abstract classes can have "abstract methods" and "non- abstract(concrete) methods"
        Abstract methods==> method without body
        non- abstract(concrete) methods ==> methods with body
    5- to create an abstract method   a- do not put method body
                                      b- use abstract keyword
                                      note: do not use "abstract" and method body together
    6- Abstract methods must be overriden by concrete child classes otherwise you get CT Error
    7- if you create "abstract methods" it means you are  focusing on "what to do" instead of
    "how to do" But concrete methods focus on "how to do "more than "what to do"

    8- Abstract methods hide the body, I mean implementation of the method
    9- When you  override an abstract method you have to create body, otherwise Java complains
    10- Abstract methods can be just in abstract classes
        You can not create abstract methods in the concrete classes

 */

    public static void main(String[] args) {

    }
    public abstract void add(); // Abstract method

    public abstract void m();


}
