package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        /*for (int i = arr.length-1; i >=0 ; i--) {
            System.out.println(arr[i]);
        }*/
        int start = 0;
        int end = arr.length - 1;
        for (int i = 0; i < arr.length ; i++) {
            if (start < end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        System.out.println("Reversed array:"+Arrays.toString(arr));
    }
}
