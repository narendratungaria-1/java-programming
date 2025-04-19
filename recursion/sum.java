package recursion;

public class sum {

    static int sums(int x) {
        if (x == 0)
            return 0;
            return (x % 10) + sums(x / 10);


    }
    public static void main(String[] args) {
        System.out.println(sums(23));
    }

}
