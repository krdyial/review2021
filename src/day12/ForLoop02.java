package day12;

public class ForLoop02 {
    public static void main(String[] args) {
        //Print the integers from 3 to 20 on the same line with a space between them

        for (int i=3;i<=20;i++){
            System.out.print(i+" ");  //3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
        }

        System.out.println();
        //Print the integers from 20 to 3 on the same line with a space

        for (int i=20; i>=3; i--){
            System.out.print(i+" ");

        }
        System.out.println();
        //Print the even integers from 12 to 32 on the same line
        // 1.Way:
        for (int i=12; i<=32;i+=2){
            System.out.print(i+" ");
        }
        System.out.println();

        //2. Way:
        for (int i=12; i<=32; i++){
            if (i%2==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Print odd numbers from 12 to 32 on the same line with spaces

        //1.Way: with if
        for (int i=12;i<32;i++){
            if (i%2!=0){
                System.out.print(i+" ");
            }
        }

        System.out.println();

        //2.way:
        for (int i=13; i<32;i+=2){
            System.out.print(i+" ");
        }

    }
}
