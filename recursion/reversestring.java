package recursion;

import java.util.Scanner;

public class reversestring {

    static  String reverse(String str){
        if(str.isEmpty()) return str;
        return reverse(str.substring(1))+str.charAt(0);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str = sc.nextLine();
        System.out.println("reversed:  "+reverse(str));
        sc.close();
    }



}
