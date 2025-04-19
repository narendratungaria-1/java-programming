package DSA.function;

public class greeting {
    public static void main(String[] args) {
//      String name =greet();
//        System.out.println(name);
//    }
//    static String greet(){
//        String greeting = "hie guys how are you";
//        return greeting;

        int a = 2;
        int b= 3;
        swap(a,b);
        System.out.println(a+" "+b);
  }
  static void swap(int a, int b){
        int temp = a;
        a=b;
        b= temp;
  }
}
