package day26;

import day27.Mammal;

public class Rabbit extends Mammal {

    public static void main(String[] args) {
        Rabbit rabbit = new Rabbit();
        rabbit.drink();
        rabbit.eat();
        rabbit.feed();
        rabbit.move();
        System.out.println(rabbit.breathe);

    }
}
