package day03;

public class TypeCasting01 {
    public static void main(String[] args) {
        // byte < short < int < long < float < double
        //TypeCasting: convert data type to another
        //1- Auto Wideninig: convert small data types to large data type. Java does it automatically
        byte num1= 123;
        short num2 = num1;

        //2- Explicit Narrowing: convert large data types to small data type.
        // you have to type the name of the small data type before the variable name
        long num3= 657;
        short num4= (short) num3;

        short num9= 520;
        byte num10 = (byte) num9;
        System.out.println(num10); // 520-256 = 264 and then 264-256=8





    }
}
