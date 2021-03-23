package day21;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Lists01 {
    public static void main(String[] args) {
        /*
        What is difference between Arrays and Lists?
        1- Arrays are fixed in length but lists are flexible(update is possible. add and remove easily)
        "Lists are resizable Arrays"
        2- When you create an Array ou have to declare length, for lists no declaration
        3- When you add a new element to an Array, you have to create an Array
        but for lists no need to create a new list

        NOTE1: like arrays we cannot use different data types in a list
        NOTE2: in arrays we can use primitives and references
                in lists we can not use primitives and references every time
                we have to use non- primitive
                if you need to use primitive datas, use Wrapped Classes
    */

        //To create a list
        //1.Way:
        ArrayList<String> l1= new ArrayList<String>();

        //2.Way:
        ArrayList<String> l2= new ArrayList<>();

        //3. Way:
        List <String> l3= new ArrayList<>();

        System.out.println(l1); // Empty List []

        //to add elements into the list.
        //add method inserts the elements to the end every time

        l3.add("John");
        System.out.println(l3);// [John]
        l3.add("Angie");
        System.out.println(l3); // [John, Angie]

        // to add an element into a specific index
        l3.add(1,"Mark");
        System.out.println(l3); // [John, Mark, Angie]

        l3.add(2,"Ibrahim");
        System.out.println(l3); //[John, Mark, Ibrahim, Angie]

        l3.add(0,"Alaettin");
        System.out.println(l3); // [Alaettin, John, Mark, Ibrahim, Angie]

        //if you use index more than length to add elements
        // you will get RTE l3.add(11,"X");
        //                  System.out.println(l3);

        //How to add a list into another list

        l2.add("X");
        l2.add("Y");
        System.out.println(l2); //[X, Y]
        l3.addAll(l2);
        System.out.println(l3); //[Alaettin, John, Mark, Ibrahim, Angie, X, Y]  --> adds at the end
        System.out.println(l2); // [X, Y] --> it does not changed

        // to add a list into a specific index
        l3.addAll(2,l2);// Adds after 1st index
        System.out.println(l3);

        //to get number of elements ( means as length of Array)

        System.out.println(l3.size()); //9

        //to check list empty or not

        System.out.println(l3.isEmpty()); //false --> returns boolean

        // to remove element from the list
        l3.remove("X");
        System.out.println(l3); // First

        //to remove an element in a specific index

        l3.remove(0);
        System.out.println(l3);
        System.out.println(l3.remove("W")); // returns boolean non existing element false

        // update an element in list

        l3.set(0,"Alaettin");
        System.out.println(l3); //before->  [John, Y, Mark, Ibrahim, Angie, X, Y]
                                //after-> [Alaettin, Y, Mark, Ibrahim, Angie, X, Y]

        //l3.set(7,"Karadayi");
        System.out.println(l3); //Run Time error. 7 is greater than 6. you can use add to add new element

        // to check a specific element exist in alist

        System.out.println(l3.contains("Angie")); // return boolean --> true

        System.out.println(l3.contains("Karadayi"));// false

        // to sort elements in a list in  natural order

        Collections.sort(l3); // To sort lists we will call it from Collections.
        System.out.println(l3); //[Alaettin, Angie, Ibrahim, Mark, X, Y, Y]

        //to delete all elements
         l3.clear(); //-->returns void. it means  nothing
        System.out.println(l3); //[]

        List<Integer> l4= new ArrayList<>();





    }
}
