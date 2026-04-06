package Arrays;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int count1 = 0;
        int count0 = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]==1){
                count1++;
            }
            else if (arr[i]==0){
                count0++;
            }
        }
        System.out.println("The count of 0s are : " + count0);
        System.out.println("The count of 1s are : "+ count1);
    }
}
