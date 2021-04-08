package day34;

public abstract class Animal extends Creature {
        /*
       1- Inside an abstract class you can use both abstract and concrete methods
       2- No complain about overriding breathe method from parent class, because animal class
       is abstract class. It is notr mandatory but if you want you can override that method

         */
    public static void main(String[] args) {

    }
    public abstract void eat();
    public abstract void sound();
    public void drink(){
        System.out.println("Animals drink water");
    }

    @Override
    public void breathe() {
        System.out.println("Animals breathe");
    }
}
