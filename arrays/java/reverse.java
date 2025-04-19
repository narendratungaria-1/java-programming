package arrays.java;

import java.lang.reflect.Array;
import java.util.Arrays;

public class reverse {
    public static void main(String[] args) {
        int[] arr1 ={1,2,3,4,5,6};
        int n = arr1.length;
        for(int i=0;i<n/2;i++){
            int temp = arr1[i];
            arr1[i]=arr1[n-i-1];
            arr1[n-i-1]=temp;
        }
        System.out.println(Arrays.toString(arr1));
    }
}
