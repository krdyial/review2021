package day11;

public class Exercise05Important {
    public static void main(String[] args) {
        String name= "Mark";

        String reverse="";

        for (int i=name.length()-1; i>=0;i--){
            reverse= reverse+ name.charAt(i);
        }
        System.out.println("Reverse String :"+ reverse.toLowerCase());
    }
}
