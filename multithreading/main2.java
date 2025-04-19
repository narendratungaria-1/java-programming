package multithreading;

public class main2 {
    public static void main(String[] args) {
        Mythread2 obj2 = new Mythread2();
        Thread t1 = new Thread();
        t1.start();
        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
            native
        }
    }
}
