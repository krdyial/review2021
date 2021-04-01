package day28;

public class Mammal extends Animal {
    public Mammal(){
        super("Johnny");
        System.out.println("M");
    }
    public Mammal(String name){
        super();
        System.out.println("Mammal with P");
    }
    /*
    if you try to use  non-existong constructor, you will
    get Compile Time Error
     */
    public static void main(String[] args) {
        Mammal mammal = new Mammal();
    }
}
