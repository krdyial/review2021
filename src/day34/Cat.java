package day34;

public  class Cat extends Animal {
    /*
    1- if child class is "concrete" it is must to override
        abstract methods but if the child class is "abstract"
        overriding abstract methods is optional
    2-

     */
    public static void main(String[] args) {

    }



    @Override
    public void eat() {
        System.out.println("Cats eat cheese");
    }

    @Override
    public void sound() {
        System.out.println("Cats meoww");
    }

    @Override
    public void drink() {
        System.out.println("Cats drink milk");
    }
}
