package day26;

public class E01 {
    private  int ssn= 123456789;
    private String name ="Alaettin Karadayi";
    boolean retired=false;
    private int salary=80000;

    public static void main(String[] args) {
        /*
        Encapsulation: Data hiding
        -Encapsulation implement -> to ,ake the access modifier "private"

         */

    }
    /*
    1- After hiding data if you want to read the value of the data from
    other classes you should create "getter methods"
    2- we use getter methods to read the values of encapsulated data from
    other classes
    3- when you create getter method   a- Make the access modifier public( sometimes protected)
                                       b- Make the return type same with the data
                                       type of  variable
                                       c- the name of the getter method will start with "get"
                                       then type the name of the variable, apply camel case

     */

    public String getName(){
        return name;
    }

    public int getSsn(){
        return ssn;
    }

    /*
    1- to update encapsulated(hidden) data we have to cerate setter method
    2- make the access modifier public(sometimes protected),
    make the return type "void",  make the data type of parameter same with
    the data type of the variable and the name of the parameter will be same
    with the name of the variable
    3- inside the method body type ===>this.salary= salary;
    4- after using set method if you want to read the updated data you have to create
    and use getter method

     */
    public void setSalary(int salary){
        this.salary=salary;
    }

    public int getSalary(){
        return salary;
    }



}
