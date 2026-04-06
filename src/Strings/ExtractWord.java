package Strings;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class ExtractWord {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        System.out.println(extract(str));

    }
    public static String extract(String s){
        String sarr[] = s.split(":");
        return Arrays.toString(sarr);
    }
}
/* s.split(":") idhula limit um use panlam
    s.split(":",2) for eg java:prog:test la java prog:test
    s.split("\\d+");
    s.split("\\s");
 */
