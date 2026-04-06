package Arrays;

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int pos = -1;
        int first = arr[0];
        System.out.println("enter the target element:");
        int target = sc.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==target){
                pos = i;
                break;
            }
        }
        if (pos!=-1){
            System.out.println(pos);
        }
        else {
            System.out.println("element not found");
        }

    }
}
// pos here is used to avoid incorrect checks
// pos is a flag variable