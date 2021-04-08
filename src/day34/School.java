package day34;

public  abstract class School {
    /*
   1- Abstract classes need child classes to be meaningful, if you
    make an abstract class final it means it can not have child classes
    this is an contradiction because of that Java complains about being final for an abstract class
    In conclusion, abstract classes can not be final.
    2- An abstract method can not be final because final method can not be overriden but the reason
    to create abstract methods is to make mandatory overriding

    3- An abstract method's access modifier can be public or protected do not use private
    because private methods can not be accessed from other classes. If you use default be careful about the package

     */
    public static void main(String[] args) {

    }
    public abstract  void add();
}
