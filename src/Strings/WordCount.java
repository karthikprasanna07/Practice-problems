package Strings;

import java.util.Scanner;

public class WordCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String word = sc.nextLine();
        System.out.println(count(s,word));

    }
    public static int count(String s, String word){
        int count = 0;
        String[] arr = s.split(" ");
        for (String s1 : arr) {
            if(s1.equals(word)){
                count++;
            }
        }
    return count;
    }
}
