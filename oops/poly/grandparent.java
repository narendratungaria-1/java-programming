package oops.poly;

class Parent {
    String name = "Parent Name";
}

class Child extends Parent {
    String name = "Child Name";
}

public class grandparent {
    public static void main(String[] args) {
        Child childObj = new Child();
        System.out.println(childObj.name);
        System.out.println(((Parent) childObj).name);
    }
}
