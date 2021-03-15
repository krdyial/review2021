package day13;

public class Scope01 {
    int num =12;
    double dbl;

    public static void main(String[] args) {
        /*
        1- if you create a variable inside the class body and outside the methods
        you can use them in everywhere inside the class

        Instance Variable: The variables created inside the class body and outside the
        methods are called "Instance Variables"

        Local Variable: if you creat a variable inside a method you can
        use it just inside that method. Inside other methods, it cannot be used


        Question:Difference Between"Instance" and "Local" Variable?
        -> Local variables must be initialized(ASSIGNING VALUE) but if you want you may not initialize instance variables

           */
            /*
            If we create a variable inseide the method paranthesis it is called local variable as well
            We can use it just inside the method body

            Do not try to use a variable before declaration.
             */


    }
    public  void add(){
        num++;
        System.out.println(dbl);
        char ch='a';
        int num2;
        //System.out.println(num2);// if we do not assign any value for local variable,
                                 //Java does not assign default value
                                // because of that we will get CTE when we want to use it

    }
    public void subtract(int i, int j) {
        num -= 5;
        //ch= 'm' We can not use ch in subtract method. Because ch cretaed in add method
                        // and it is used only in that method
    }

    public void product(){
        //x= x*5;    // int x =12; is declaration. If you want to use a variable, first
        int x=12; // declarate it and after that use it. Because java reads codes top to down.
    }
}
