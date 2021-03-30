package day27;

public class Mammal extends Animal {
    //Smell is a default variable
    // because of that if you try to inherit it from other packages
    // in day26 package we created a Rabbit class. But we could  not
    // inherit smell variable
    String smell ="They smell well";
    public static void main(String[] args) {


    }
    /*
    public or protected variable or methods can be inherited without any issue

    Child class = Sub class
    Parent class= super class
    -Static methods and variables can not be inherited
      */
    public void feed(){
        System.out.println("They feed");
    }
}
