package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class CopyContents {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int[] arr1 = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            arr1[i] = arr[i];
        }
        System.out.println(Arrays.toString(arr1));
    }
}
