package day31;

import java.io.FileInputStream;
import java.io.IOException;

public class Exceptions01 {
    /*
    1-FileNotFoundException is used for "path problems" or "File existence problems"
    2- IOException: is used for every kind of problems about Input Output like
    Reading a file, writing a file, closing file, path problems, file existing problems ...
    3- IOException class is the parent class of FileNotFoundException class.
    4- If you need to throw more than 1 exceptions after throws keyword type the names of the
    exception classes with a comma between them
    like ====> IOException, ArithmeticException, IllegalArgumentException
    5- FileNotFoundException and IOExceptions are "Checked Exceptions" (Compile Time Exceptions)
    6- If you have "CheckedExceptionsError" you have to fix(handle) it.

     */

    public static void main(String[] args) throws IOException, ArithmeticException, IllegalArgumentException{
        FileInputStream fis = new FileInputStream("src/day31/TextFile");

        int i = 0;
        while ((i = fis.read()) != -1) {
            System.out.print((char) i);
        }

        fis.close();
    }
}
