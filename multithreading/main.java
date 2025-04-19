package multithreading;

public class main {
    public static void main(String[] args) {
          mythread obj1 = new mythread();
          obj1.start();

        for (int i = 0; i < 10; i++) {
            System.out.println("main thread");
        }
    }
}
