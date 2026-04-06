package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        rev(s);
    }
    public static void rev (String s){
        String[] arr = s.split(" ");
        int start = 0;
        int end = arr.length-1;
        while(start<end){
            String temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
        System.out.println(Arrays.toString(arr));
    }
}
