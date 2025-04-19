package oops.Interface;

 abstract  class Animals {
    abstract void sound();

    void eat(){
        System.out.println("the animal eat the food");
    }


}
class Dog extends Animals {
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}

// Main Class
public class Animal {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();
        dog.eat();   
    }
}
