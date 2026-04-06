package Strings;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EvenLength {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string: ");
        String s1 = sc.next();
        for (int i = 0; i < s1.length() ; i++) {
            if(i%2==0){
                System.out.print(s1.charAt(i));
            }
        }
    }
}
