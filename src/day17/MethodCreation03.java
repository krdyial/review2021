package day17;

public class MethodCreation03 {

    public static void main(String[] args) {
        add();
        add(5);
    }
    /* if you create two methods whose names and parameters are same you will get CTE
    1- To fix that problem you change the names but sometimes we need the methods whose names are same.
    This sometimes can not be a good solution
     2- The best solution is changing parameters.how we do it?
      --> to change parameters you increase or decrease the number of parameters
      --> change the data type of parameters
      --> if the data types are different change the order

      NOTE: changing return type, changing access modifier, changing method body does not solve that problem
       */

    public static void add(){
        System.out.println("Addition");
    }
    public static void add(int x){
        System.out.println("Second addition");
    }
    public static void add(double x){

    }
    public static void add(int x, boolean b){

    }
    public static void add(boolean b, int x){

    }


}
