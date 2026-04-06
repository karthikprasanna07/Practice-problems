package Strings;

import java.util.Scanner;

public class HexadecimaltoDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        convert(s);
    }
    public static void convert(String s){
        int ans = 0;
        int power = 0;
        int hexval = 0;
        for (int i = s.length()-1; i >=0  ; i--) {
            char ch = s.charAt(i);
            int val = ch -'A' + 10; // character ah adhoda corresponding hexadecimal ah convert panradhuku
            hexval = val* (int)Math.pow(16,power)+hexval;
            power++;
        }
        System.out.println(hexval);
    }
}
