package Arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CountDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        System.out.println("enter elements of array :");
        for (int i = 0; i <size ; i++) {
            arr[i] = sc.nextInt();
        }
        int count = 0;
        int[] duplicatearray = new int[arr.length];
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length ; j++) {
                if (arr[i]==arr[j]){
                    count++;
                    duplicatearray[i] = arr[i];
                    System.out.println("the duplicate elements are " +arr[i]);
                }
            }
        }

        System.out.println(Arrays.toString(duplicatearray));
        System.out.println("The duplicates are "+count);
    }
}
// also use LinkedHashSet
