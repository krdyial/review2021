package day17;

public class MethodCreation01 {

    public static void main(String[] args) {
    add();
    subtract(5,3); //if your method has parameters when you call the method,
        // you have to use values for the parameters
        // Values for parameters are called "arguments" in Java
        // in subtract(int x, int y) "int x" and "int y " are parameters
        // in subtract(5,3) --> "5" and "3" are arguments
        System.out.println(multiply(5, 3));
    }

    public static void add(){
        System.out.println("Addition");
    }

    public static void subtract(int x, int y){
        System.out.println(x-y);
    }
    public static int multiply(int x, int y){
        return x*y;
    }

}
