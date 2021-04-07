package day33;

public class Exceptions04 {

    public static void main(String[] args) {
        try {
            Object obj = new Integer(80); // Integer constr. needs a value
            //you can use class name from parent class, but for constructor you can not use parent
            String s = (String) obj; // Explicit narrowing
        }catch (ClassCastException e){
            System.out.println(e);
        }

    }

    /*
    Checked(CompileTimeException): You have to handle it
    1- FileNotFoundException: PAth+ Existence of the file
    2- IOException: Read+ Write+ Close files(Input Output)

    Unchecked(RunTimeExceptions):
    1- Arithmetic Exception: MAth rules ex: Dividing by 0
    2- NullPointerException: length() for null
    3- ArrayIndexOutOfBoundsException: Using non-existing index for arrays
    4- IllegalArgumentException: for logical errors  ex: negative value for age
    5- ClassCastingException: if you try to cast object class to String class
    6- NumberFormatExceptions: When you use parseInt() method with a String
                                which is not created by digits


    */
}
