package day17;

public class Animal {
    int age=7;
    String name ="Dog"; //default value for String is "" or null
    boolean mammal; // Default value for booleans is false

    Animal(){
        System.out.println("No parameter");
    }

    Animal(boolean mammal){
        this();
        System.out.println("boolean");

    }

    Animal(int age, String name){
        System.out.println("int and String");
    }

    public static void main(String[] args) {
        Animal a1= new Animal(true);

    }
}
