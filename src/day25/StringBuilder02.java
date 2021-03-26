package day25;

public class StringBuilder02 {

    public static void main(String[] args) {
        // how to use substring  with StringBuilder
        StringBuilder stb1= new StringBuilder("Learn Java");

        //if a method which you are using is coming from String class
        // it can not update the StringBuilder
        System.out.println(stb1.substring(6)); //Java
        System.out.println(stb1); //it will not updated ->Learn Java

        //to use multiple append() in one line

        stb1.append("X").append("Y");
        System.out.println(stb1); // Learn JavaXY

        //to use insert
        stb1.insert(0,"A"); // offsette verilen deger index degeri,
                                     // belirtilen index degerine belirtilen String eklenir
        System.out.println(stb1);  //ALearn JavaXY

        stb1.insert(6,"/");
        System.out.println(stb1); // insert just inserts without deleting  ALearn/ JavaXY

        stb1.delete(1,6);// first inclusive second exclusive
        System.out.println(stb1); //deletes Learn  ---> A/ JavaXY

        // to use deleteCharAt()
        stb1.deleteCharAt(1);
        System.out.println(stb1); //A JavaXY

        //how to use reverse()
        stb1.reverse();
        System.out.println(stb1); //  YXavaJ A

        StringBuilder stb2= new StringBuilder(9);
        System.out.println(stb2.capacity()); // 9 reserved capacity
        System.out.println(stb2.length()); //   0  used length

        stb2.append("abcd");
        System.out.println("capacity :"+stb2.capacity()); //9
        System.out.println("length :"+ stb2.length());  //4

        stb2.append("efghijklm");
        System.out.println("new stb2 :"+stb2);
        System.out.println("new stb2 capacity: "+stb2.capacity()); //20
        System.out.println("new stb2 length: "+stb2.length()); //13

        //to use setCharAt() --> set means update

        stb2.setCharAt(1,'X');
        System.out.println(stb2); // abcdefghijklm  ---> updated    aXcdefghijklm

    }
}
