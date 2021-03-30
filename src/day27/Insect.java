package day27;

public class Insect extends Animal {

    boolean poisonous= true;
    public static void main(String[] args) {

        Insect insect= new Insect();
        System.out.println("Can insects poisonous? "+insect.poisonous);
        System.out.println("Can insect breathe? "+ insect.breathe);
        insect.eat();
        insect.drink();
        insect.invisible();


    }
    public void invisible(){
        System.out.println("Some insects are invisible");
    }
}
