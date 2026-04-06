package Strings;

import java.util.Scanner;

public class RemoveSpace {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String str = sc.nextLine();
        System.out.println(rmv(str));
    }
    public static String rmv(String s){
            s = s.replace(" ","");
            return s;
    }
}

