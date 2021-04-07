package day33;

public class Exceptions02 {
    /*
    Create a getAge() method
    For negative ages throw exception
     */
    public static void main(String[] args) {
    try{
        getAge(5);
    }catch(IllegalArgumentException e){
        System.out.println(e.getMessage() );
    }


    }

    public static void getAge(int age){
        if(age<0){
            throw new IllegalArgumentException("This age is impossible");
        } else {
            System.out.println(age);
        }
    }
}
