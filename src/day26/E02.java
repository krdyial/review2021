package day26;

public class E02 {

    public static void main(String[] args) {

        E01 obj1= new E01();
        System.out.println(obj1.retired); // false.
        // you can not see here private datas from E01 class

        System.out.println(obj1.getName());//Alaettin Karadayi
        System.out.println(obj1.getSsn());// 123456789
        obj1.setSalary(85000);
        System.out.println(obj1.getSalary());//85000

        E04 ob= new E04();
        System.out.println(ob.getDisease()); //  Corona
        System.out.println(ob.isOld()); //  false
        ob.setCcn("23131654631321");
        ob.setOld(true);
        System.out.println("After updating :"+ob.isOld()); //true

    }
}
