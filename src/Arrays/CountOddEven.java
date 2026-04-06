package Arrays;

import java.util.Scanner;

public class CountOddEven {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int oddcount = 0;
        int evencount = 0;
        for (int i = 0; i < arr.length ; i++) {
            if(arr[i]%2==0){
                evencount += 1;
            }
            else{
                oddcount += 1;
            }
        }
        System.out.println("Even number count is: " + evencount);
        System.out.println("Odd number count is: "+ oddcount);
    }
}
