package recursion;

import java.util.Scanner;

public class power {
    static int powernum(int x,int n){
        if(n==0) return 1;
        return x * powernum(x,n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x=sc.nextInt();
        int n=sc.nextInt();
        System.out.println("power number:  "+powernum(x,n));
        sc.close();
    }
}
