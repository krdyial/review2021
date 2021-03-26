package day25;

public class StringBuildr {

    public static void main(String[] args) {
        //1.way:
        StringBuilder stb1= new StringBuilder(); //create StringBuilder
        System.out.println(stb1.append("A"));
        System.out.println(stb1); //

        //2.way: to create StringBuilder
        StringBuilder stb2= new StringBuilder("Java");
        stb2.append("X");
        System.out.println(stb2); //JavaX

        //3. Way: to create SB
        // if you use integer inside the constructor paranthesis, it means
        // the length of the created String
        StringBuilder stb3= new StringBuilder(5); //length of String :5
        stb3.append("Java");
        System.out.println(stb3);
        stb3.append("XY");
        System.out.println(stb3); //JavaXY its length 6 but in stringbuilder our capacity is 5
                                  // it does not matter. StringBuilder is flexible and open to update





    }
}
