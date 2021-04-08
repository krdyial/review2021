package day34;

public class Dog extends Animal {
        /*
       1- Inside a concrete class you cannot create abstract mnethod.
        All methods inside a concrete class must be concrete
       2- you have to override all abstract methods from all parents
       not just from the first parent.
         */
    public static void main(String[] args) {

    }

    @Override
    public void breathe() {
        System.out.println("Dogs breathe");
    }

    @Override
    public void eat() {
        System.out.println("Dogs eat meat");
    }

    @Override
    public void sound() {
        System.out.println("Dogs bark");
    }
    //public abstract void add();
}
