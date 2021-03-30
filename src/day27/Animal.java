package day27;

public class Animal {
    public boolean breathe=true;
    //private methods and variables can not be inherited
    // because private things can not be accessed from other classes.
    private String type= "Animal";

    public static void main(String[] args) {

    }
    public void eat(){
        System.out.println("They eat");
    }

    public void drink(){
        System.out.println("They drink");
    }
    public void move(){
        System.out.println("They move");
    }


}
