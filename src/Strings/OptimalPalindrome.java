package Strings;

import java.util.Scanner;

public class OptimalPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("string is palindrome");
        }
        else{
            System.out.println("string is not palindrome");
        }

    }

    private static boolean isPalindrome(String str) {
        int start = 0;
        int end = str.length()-1;
        while (start<end){
            if (str.charAt(start) != str.charAt(end)){
                return false;
            }
            start++;
            end--;
        }
        return true;
    }
}

