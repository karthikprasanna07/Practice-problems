package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(isPalindrome(str)){
            System.out.println("strings are palindrome");
        }
        else{
            System.out.println("strings are not palindrome");
        }
    }
    public static boolean isPalindrome(String str) {
        String rev = "";
        for (int i = str.length()-1; i >= 0 ; i--) {
            rev += str.charAt(i);
        }
        return rev.equals(str);
    }
}
