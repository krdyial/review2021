package day24;

public class VarArgs01 {

    public static void main(String[] args) {
        /*
            Sometimes we need flexible number of parameters
            if you use varargs as a parameter in a method, your method runs for
            every number of arguments
            To create a vargargs use"..." after the data type. The syntax is like
            "int...x"
            Varargs is actuallyan array because of that in varargs we use Array methods
            Vargargs is like a bottomless pit, you casn put infinitely many number of elements
            into it,  there is no any limit
            If yu want do not put any element into varargs , it is fine

            RULE 1: IF YOU USE VARRGS IN A METHOD IT MUST BE THE LAST PARAMETER
                    IF YOU USE VARARGS AT THE BEGINNING OR IN THE MIDDLE YOU WILL GET CTE

             RULE 2: IF YOU USE MORE THAN 1 VARARGS IN A METHOD AS A PARAMETER
             YOU WILL GET CTE
         */
        add(); //0
        add(4); // 4
        add(2,3); // 5
        add(2,3,4,5,6); // 20
        charAdd('a','l','i');
        System.out.println();
        charAdd('d','a','m','l','a');
        System.out.println();
        charAdd('n','e','c','l','a');
    }
    public static void add(int... x){
        int sum=0;
        for (int w: x){
            sum= sum+w;
        }

        System.out.println(sum);
    }

    /*
      Create a method
      The method will accept the characters ad return the characters after joining
     */

    public static void charAdd(char...ch){
        for (char w: ch){
            System.out.print(w);
        }
    }

    public static void test(int i, String str, int...k){

    }
}
