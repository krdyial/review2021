package day22;

public class ForEachLoop01 {
    public static void main(String[] args) {
        /*
        1-For Each loop works with collections. (We learned Arrays and Lists)
        2- other name of for each loop is "Enhanced Loop"

         */

        int arr[]= {1, 2,3,4,5};

        //to print all elements of an array on the console
        for (int w:arr){
            System.out.print(w+" ");
        }
        System.out.println();
        //find the sum of all elements of arr by using for each loop

        int i=0;
        for (int e: arr){
            i=i+e;

        }
        System.out.println(i);

        //print the even elements by using for each loop

        for (int w: arr){
            if(w%2==0){
                System.out.print(w+" ");
            }
        }
        System.out.println();
        //to use continue

        for (int w:arr){
            if (w%2!=0){
                continue;
            }
            System.out.print(w+" ");
        }
        System.out.println();
        // find the multiplication of odd elements
        int pro=1;

        for (int w:arr) {
            if (w%2==0){
                continue;
            }
            pro=pro*w;
        }
        System.out.println(pro);

        //Fnd sum of all elements except 3 by using for each loop  and continue
        int sum=0;
        for (int w: arr){
            if (w==3){
                continue;
            }
            sum=sum+w;
        }
        System.out.println("Sum of the number except 3 :"+sum);
    }
}
