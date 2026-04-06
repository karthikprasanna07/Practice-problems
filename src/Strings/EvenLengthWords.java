package Strings;

import java.util.Scanner;

public class EvenLengthWords {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s1 = sc.nextLine();
        wordcount(s1);


    }
    public static void wordcount (String s){
        String s1[] = s.split(" ") ;
        for (String s2 : s1) {
            if (s2.length() % 2 == 0) {
                System.out.println(s2);
            }
        }
    }
}
