package day33;

public class Exceptions03 {

    public static void main(String[] args) {
        long x= 1234;
        int y= (int)x; //Explicit narrowing

        try{
            String s= "123";
            Integer z=Integer.parseInt(s);
            System.out.println(z);
        }catch (ClassCastException e){
            System.out.println("Strings cannot be casted to integer");
        }


    }
}
