package oops.constructor;

public class person {
    public static void main(String[] args) {
        child obj = new child();
    }

}
class persons {
    persons(){
        System.out.println("in parent");
    }
}
   class child extends persons{
    child(){
        System.out.println("in child");
    }
   }

