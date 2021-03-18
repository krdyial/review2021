package day16;

public class Car {

    int price=20000;
    int year= 2015;
    String make="Honda";
    String type="Civic";

    Car(){

    }
    //Create a const. with one parameter
    //when I create a const.
    Car(int price){
        this.price=price;
    }

    Car(String make, int year){

    }

    Car(String make, String type, int year, int price){
        this.make=make;
        this.type=type;
        this.year=year;
        this.price=price;

    }




    public static void main(String[] args) {

        Car c1= new Car();
        System.out.println(c1.price); //20000
        System.out.println(c1.year); // 2015
        System.out.println(c1.make); // Honda
        System.out.println(c1.type); //Civic

        System.out.println("=====For c2=======");
        Car c2 = new Car(10000);
        System.out.println(c2.price);//10000
        System.out.println(c2.year);//2015
        System.out.println(c2.make);//Honda
        System.out.println(c2.type);//Civic
        System.out.println("=======For c2==========");

        Car c3 = new Car("Audi", 2015);

        //Create  a car whose make is Infinity, type is Q50, year is 2018, price is 24000
        // then print all features on thew console

        System.out.println("=========This is for c4===============");
        Car c4 = new Car("Infinity", "Q50",2018,24000 );
        System.out.println(c4.make);
        System.out.println(c4.price);
        System.out.println(c4.year);
        System.out.println(c4.type);
        System.out.println("=========This is for c4===============");

    }
}
