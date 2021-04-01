package day29;

public class Cat extends Animal {

    public static void main(String[] args) {

    }
    /*The overriding methods (methods in child class) can not use
    more restricted access modifiers than overridden(methods inside the parent class) methods
    The access modifiers of overriding methods can be same or wider  than overridden methods.
    For example; if overridden method's access modifier is "default" then overriding method's
    access modifier can be "default" , "protected" and "public"


     */
    /*
    1-The return type of overriding methods(methods in child) must be same with the return type of overriden methods
                                                                                               (methods in parent class)
     2-The child of the return type of
     */

    @Override
    public void move() {

    }

    @Override
    public void sound() {

    }

    @Override
    public void eat() {
        System.out.println("Eat cheese");
    }

    @Override
    public Cat drink() {
        return new Cat();
    }

    @Override
    public int add() {
        return 5;
    }
}
