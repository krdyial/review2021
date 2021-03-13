package day12;

public class ForLoop01 {
    public static void main(String[] args) {
        /*
        print "Hello on the Console 10 times
         */

        //1.Way: Not recommended

        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");

        //2. Way: For loop

        for (int i=1; i<=10; i++){
            System.out.println("Hello");
        }
        System.out.println("For LOOP");
        //Type your name 20 times
        for (int i=1; i<=20;i++){
            System.out.println("Alaettin");
        }
    }
}
