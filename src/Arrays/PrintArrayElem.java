package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class PrintArrayElem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println(Arrays.toString(arr)); //prints an array in a proper format
    }
}
