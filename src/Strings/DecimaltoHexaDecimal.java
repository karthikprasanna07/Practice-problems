package Strings;

import java.util.Scanner;

public class DecimaltoHexaDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        System.out.println(dectohex(num));

    }
    public static String dectohex(int num){
        char[] a = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        StringBuilder sb = new StringBuilder();
        int rem = num % 16;
        char c = a[rem];
        int quo = num/16;
        if(quo!=0){
            sb.append(quo);
        }
        sb.append(c);
        num = num/16;
        return sb.toString();
    }
}
