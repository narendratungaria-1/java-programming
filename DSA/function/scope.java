package DSA.function;

public class scope {
       static int f =55;
    public static void main(String[] args) {
        int a = 20;
        int b = 2;
        System.out.println(f);
        {
            int c = 55;

            a=30;
            System.out.println(a);
        }
        int c = 556;
        System.out.println(c);
       nut();
    }

    static void nut(){
        int b = 33;
        System.out.println(f);

    }
}
