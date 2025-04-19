package DSA.function;

public class shadowing {
     static int x = 20; // we can use this anywhere  this i shadowing at lin 8 beacuse it overhide the uperlevel to lower level function intializtion

    public static void main(String[] args) {
        System.out.println(x);
        int x  =60;
        System.out.println(x);
        fun();
    }
    static void fun(){
        System.out.println(x);
    }
}
