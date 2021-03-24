package day22;

import java.util.ArrayList;
import java.util.List;

public class ForEachLoop02 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(11);
        list.add(12);
        list.add(13);
        list.add(14);
        list.add(15);
        System.out.println(list);
        // Find the avarage value of all elements by using for each loop

        //to be able to get the average value in decimal I have to use double data for sum
        double sum=0;
        for (Integer w:list
             ) {
            sum=sum+w;
        }
        System.out.println("Average of list: "+sum/list.size()); //13

        //remove all odd elements from the list

        for (Integer w: list){
            if (w%2!=0){
                continue;
            }
            System.out.print(w+" ");
        }

        System.out.println();
        //print just first two elements
        int count =0;
        for (Integer w: list){
            System.out.print(w+ " ");
            count++;
            if (count==2){
                break;
            }
        }



    }


}
