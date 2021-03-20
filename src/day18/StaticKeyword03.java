package day18;

public class StaticKeyword03 {
    public static void main(String[] args) {
        StaticKeyword01 obj1= new StaticKeyword01();
        StaticKeyword01 obj2= new StaticKeyword01();
        StaticKeyword01 obj3= new StaticKeyword01();


        obj1.increment();// i=13 k=14
        obj2.increment();



        System.out.println(obj1.k);//14  //14
        System.out.println(obj2.k);//13  //14
        System.out.println(obj3.k);//13  //13

        System.out.println(obj1.i);//13  //14
        System.out.println(obj2.i);//13  //14
        System.out.println(obj3.i);//13  //14


            }
}
