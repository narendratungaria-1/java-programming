package multithreading;

public class Mythread2 implements Runnable{
    @Override
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("my thread");

        }
    }
}
