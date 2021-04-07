package day32;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Exceptions01 {
    /*
    to handle a CT Exception we have two options:
    1- we can use "throws" keyword
    2- we can use try catch block. This is better

    NOTE: if there is a parent child relationship between exception order is important in the catch block
    BUt if there is no  parent child relationship between exceptions, order is not important

     */
    public static void main(String[] args) throws IOException {
        FileInputStream fis = null;
        try {
             fis = new FileInputStream("src/day31/TextFile");
            int i = 0;
            while ((i = fis.read()) != -1) {
                System.out.print((char) i);
            }


            System.out.println(5 / 2);


        } catch (ArithmeticException e) {
            System.out.println("Do not divide by 0");
        } catch (FileNotFoundException e) {
            System.out.println("The path is wrong or the file is not accessible");
        } catch (IOException e) {
            System.out.println("File is not okay tor ead or close");
        }finally {
            fis.close();
            System.out.println("Done!");
        }
    }
}
