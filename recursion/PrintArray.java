package recursion;
import java.util.Scanner;
public class PrintArray {
    static void print(int[] arr, int index) {
        if (index == arr.length) return;
        System.out.print(arr[index] + " ");
        print(arr, index + 1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter array size: ");
        int size = sc.nextInt(), arr[] = new int[size];
        System.out.println("Enter elements: ");
        for (int i = 0; i < size; i++) arr[i] = sc.nextInt();
        print(arr, 0);
        sc.close();
    }
}
