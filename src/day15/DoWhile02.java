package day15;

public class DoWhile02 {
    public static void main(String[] args) {
        //Print first 10 counting numbers on the console by using do-while loop

        int i=1;

        do{
            System.out.print(i+" ");
            i++;
        }while(i<=10);

        //Print first 5 even counting numbers on the console by using do-while loop
        System.out.println();
        int j=1;


        do{
            if (j%2==0){
                System.out.print(j+" ");
            }
            j++;
        }while(j<=10);

        System.out.println();

        //print the counting numbers which are divisible by 3 and less than 100

        int k=1;
        int count =0;

        do{
            if (k%3==0){
                System.out.print(k+" ");
                count++;
            }
            k++;
        }while(k<100);
        System.out.println();
        System.out.println("Between 1 and 100 there are "+count+" numbers divisible by 3");

    }
}
