package oops.poly.methodoverriding;

class animal{
       void eat(){
        System.out.println("animal want to eat");
    }
     protected void walk(){
        System.out.println("animal want walk");
    }
}
class dog extends animal{
     void eat(){
        System.out.println("dog wants to eat");
    }
     public void bark(){
        System.out.println("dog barking on harshita");
    }
}
public class zoo {
    public static void main(String[] args) {
        animal obj = new dog();
        obj.eat();
        obj.walk();
    }
}
