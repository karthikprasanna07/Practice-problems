package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SortArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] arr2 = new int[size];
        int[] arr1 = {2,3,4,1,5};
        sort(arr1);
        System.out.println(Arrays.toString(arr1));
    }
    public static void sort(int [] arr1){
        int i = 0;
        while (i < arr1.length) {
            int correctIndex = arr1[i] - 1;
            if (arr1[i] != arr1[correctIndex]) {
                swap(arr1, i, correctIndex);
            } else {
                i++;
            }
        }
    }
    public static void swap(int[] arr1, int first, int second){
        int temp = arr1[first];
        arr1[first] = arr1[second];
        arr1[second] = temp;
    }
}
