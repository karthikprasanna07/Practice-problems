package BasicPrograms;

import java.util.Scanner;

public class VowelCount {
    public static void main(String[] args) {
        int count = 0;
        System.out.println("Enter a string:");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        char ch;
        for (int i = 0; i < s.length(); i++) {
            ch = s.charAt(i);
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch =='o' || ch =='u' ) {
                count += 1;
                System.out.println(ch);
            }
        }
        System.out.println(count);
    }
}