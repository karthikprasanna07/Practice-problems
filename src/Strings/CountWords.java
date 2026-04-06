package Strings;

import java.util.Scanner;

public class CountWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        System.out.println(count(str));
    }
    public static int count (String s){
        int count = 1;
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch == ' ') {
                count++;
            }
        }
        return count;
    }
}

