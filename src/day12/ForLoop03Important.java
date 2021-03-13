package day12;

public class ForLoop03Important {
    public static void main(String[] args) {
        //Print the integers which are divisible by 3 from 1 to 70
        // on the same  line

        for (int i=3; i<=70;i+=3){
            System.out.print(i+" ");
        }
        System.out.println();
        for (int i=1; i<=70; i++){
            if (i%3==0){
                System.out.print(i+" ");
            }
        }
        System.out.println();
        //Find the sum of first 10 numbers and print the sum on the console
        int sum=0;
        for (int i=1; i<=10; i++){
            sum=sum+i;
        }
        System.out.println(sum);
    }
}
