package DSA.function;

import java.util.Arrays;

public class chnagevalue {
    public static void main(String[] args) {
        int [] arr1 =  {1,4,7,9,2};
         change(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    static void change(int []num){
        num[0]=99;
    }
}
