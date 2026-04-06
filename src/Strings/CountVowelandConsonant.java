package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class CountVowelandConsonant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine().toLowerCase();
        vowcons(str);
    }
    public static void vowcons (String s){
        int vowcount = 0;
        int conscount = 0;
        for (int i = 0; i < s.length() ; i++) {
            char ch = s.charAt(i);
            if(ch >= 'a' && ch <= 'z'){
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
                    vowcount++;
                }
                else{
                    conscount++;
                }
            }
        }
        System.out.println("vowel count : "+ vowcount);
        System.out.println("consonant count : "+ conscount);
    }
}
