package oops.constructor;

import java.sql.SQLOutput;

public class parametrize {
      int rollno;
    String name;
    int date;
    String city;
    public parametrize(int a,String n){
        rollno=a;
        name = n;
    }

    public static void main(String[] args) {
        parametrize obj1 = new parametrize(10,"narendra");
        parametrize obj2 = new parametrize(11,"harshita");
        parametrize obj3 = new parametrize(12,"lakshya");

        System.out.println(obj1.rollno);
        System.out.println(obj2.rollno);
        System.out.println(obj3.rollno);


    }
}

