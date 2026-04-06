package Strings;

import java.util.Scanner;

public class SwapPairofChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        swap(s1);

    }
    public static void swap(String s){
        char[] arr = s.toCharArray();
        int left = 0;
        int right = 1;
        while(right<arr.length && left< arr.length){
            char temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left+=2;
            right+=2;
        }
        System.out.println(String.valueOf(arr));
    }
}
