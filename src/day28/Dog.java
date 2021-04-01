package day28;

public class Dog extends Mammal{
    public Dog(){
        super(); // to call parent constructor we use super()
        System.out.println("D");
    }
    public static void main(String[] args) {
        Dog dog= new Dog(); //AMD
        Insect ins= new Insect(); //AI

        Cat cat= new Cat(); // AMC

        Mammal mammal= new Mammal(); //AM


    }
}
