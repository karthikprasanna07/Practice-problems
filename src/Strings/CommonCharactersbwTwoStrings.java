package Strings;

import java.util.Scanner;

public class CommonCharactersbwTwoStrings {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        System.out.println("enter another string : ");
        String str1 = sc.nextLine();
        System.out.println(commchar(str,str1));
    }
    public static String commchar(String s, String s1){
        StringBuilder sb = new StringBuilder();
        for (int i=0;i<s.length();i++){
            for (int j = 0; j < s1.length(); j++) {
                if(s.charAt(i)==s1.charAt(j)) {
                    sb.append(s.charAt(i));
                }
            }
        }
        return sb.toString();
    }
}
