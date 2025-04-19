package oops.poly.methodoverriding;

 class worker {
    public void walk(){
        System.out.println("slow");
    }

}
 class employe extends worker {
    public void walk(){
        System.out.println("fast");
    }
}
public class person{
    public static void main(String[] args) {
        worker obj = new worker();
        obj.walk();
        employe obj1 = new employe();
        obj1.walk();
       worker obj3 = new employe();
       obj3.walk();

    }
}



