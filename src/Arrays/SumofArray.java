package Arrays;

import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array:");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements to be added:");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < arr.length ; i++) {
            sum+= arr[i];
        }
        System.out.println("Sum of array is : "+ sum);
    }
}
