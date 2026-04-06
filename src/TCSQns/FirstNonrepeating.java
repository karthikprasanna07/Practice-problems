package TCSQns;


import java.util.Scanner;

public class FirstNonrepeating {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = sc.nextInt();
        }
        nonreppeating(arr);
    }
    public static void nonreppeating(int[]arr){
        for (int i = 0; i < arr.length ; i++) {
            int count = 0;
            for (int j = 0; j < arr.length ; j++) {
                if(arr[i]==arr[j]){
                    count++;
                }
            }
            if(count==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
}
