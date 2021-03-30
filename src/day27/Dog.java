package day27;

public class Dog extends Mammal
{
    boolean loyal= true;

    public static void main(String[] args) {

        Dog dog= new Dog();
        System.out.println("Can a dog breathe? "+dog.breathe);
        System.out.println("Can a dog loyal? "+dog.loyal);
        System.out.println("Can a dog smell? "+dog.smell);
        dog.bark();
        dog.drink();
        dog.eat();
        dog.feed();
        dog.move();




    }
    public void bark(){
        System.out.println("They bark");
    }

}
