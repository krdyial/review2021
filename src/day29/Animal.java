package day29;

public class Animal {

    public static void main(String[] args) {

    }
     void sound(){
        System.out.println("Animals make sound");
    }
    public void eat(){
        System.out.println("Eat all");
    }
    public void move(){

    }
    public Animal drink(){
        return new Animal(); // Generally we use new Animal() as a return. It is const.
    }                        //we create a new obj. with new Animal () script

    public int add(){
        return 4;
    }
    public final  void product(){
        System.out.println("Multiplication");
    }
    public static void division(){
        System.out.println("Division");
    }
    private void m1(){
        System.out.println("Method 1");
    }

}
