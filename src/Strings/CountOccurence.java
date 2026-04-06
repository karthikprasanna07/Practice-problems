package Strings;

import java.util.Scanner;

public class CountOccurence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        System.out.println("enter a char to find the occurence: ");
        char ch = sc.next().charAt(0);
        System.out.println(count(str,ch));

    }
    public static int count(String s,char ch){
        int count = 0;
        for (int i = 0; i < s.length() ; i++) {
            if((s.charAt(i)==ch)){
                count++;
            }
        }
        return count;
    }

}
