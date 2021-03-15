package day13;

public class Wrapper01 {
    public static void main(String[] args) {


        int i = Integer.MAX_VALUE;
        System.out.println("Max value of integer :" +i);

        int k= Integer.compare(12,15);
        System.out.println(k); // In compare method it means first number is less. -1

        int j = Integer.compare(231,15);
        System.out.println(j); //In compare method it means first number is greater. 1

        boolean b= Boolean.valueOf(2<1);
        System.out.println(b); //false



    }
}
