package Strings;

import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string s1 : ");
        String s1 = sc.nextLine();
        System.out.println("enter a string  s2 : ");
        String s2 = sc.nextLine();
        System.out.println(anagramCheck(s1, s2));
    }

    public static boolean anagramCheck(String s1, String s2) {
        char[] s1array = s1.toCharArray();
        char[] s2array = s2.toCharArray();
        Arrays.sort(s1array);
        Arrays.sort(s2array);
        if (Arrays.equals(s1array, s2array)) {
            return true;
        }
        return false;
    }
}