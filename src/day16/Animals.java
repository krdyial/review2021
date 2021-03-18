package day16;

public class Animals {
    int height=50;
    String name="Rabbit";
    boolean mammal= true;

    Animals(){

    }

    Animals(String name, int height){
        this.name=name;
        this.height= height;
    }
    public static void main(String[] args) {
        /*
        Create 2 constructors  one with parameters, the other without parameter
        By using that const. create at least 2 objects the print their features
        on the console
         */

        Animals a1= new Animals();
        System.out.println("Height of a1: "+a1.height);
        System.out.println("Mammal of a1: "+a1.mammal);
        System.out.println("Name of a1: "+a1.name);

        System.out.println("===========================");
        Animals a2 = new Animals("Cat",60);

        System.out.println("Name of a2: "+ a2.name);
        System.out.println("Mammal of a2: "+a2.mammal);
        System.out.println("Height of a2: "+a2.height);


    }
}
