package DSA.arrays;

import java.util.Scanner;

public class arr {
    public static void main(String[] args) {
        // int [] roll==  compile time
        //new roll[] ===  run time   heap memory
        // heap object are in heap
        // heap object are not continous
        // DMA
        //array obj in java may not be continous
        int[] roll = new int[5];
        Scanner in = new Scanner(System.in);
        for(int i =0;i< roll.length;i++){
            roll[i] = in.nextInt();
         int sum =0;
         sum = sum+roll[i];
            System.out.println(sum);
        }

        for(int i =0;i< roll.length;i++) {
            System.out.print(roll[i]+" ");


        }
    }
}



