package day28;

public class StudentDesk extends Classroom {
    boolean broken= false;
    int bazuka=25;
    public static void main(String[] args) {
        StudentDesk std1= new StudentDesk();
        System.out.println(std1.broken); //false
        /*
        if you have variables whose names are same to understand which one
        will be used you should look at the datatype of the object
        In the following example, if data type of "std" is Classroom the output will be true
         */
        /*
        if you have methods whose names are same to understand which one
        will be used you should look at the constructors of the object
        In the following example, if constructor of "std1" is StudentsDesk() the output will be "New Desk"
        If the constructor of std1 is Classroom() output will be "Classroom desk"
         */

        Classroom std2= new StudentDesk();
        System.out.println(std2.broken); //true

        System.out.println(std2.area);//300


        School std3= new StudentDesk();
        System.out.println(std3.area);//400000


        System.out.println("STD1 AREA = "+std1.area);//300
        System.out.println("Initial ="+std1.initial); //B

        std1.desk(); //New Desk

        std2.desk(); //New Desk


    }
    public void desk(){
        System.out.println("New Desk");
    }
}
