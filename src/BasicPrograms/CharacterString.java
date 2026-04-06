package BasicPrograms;

import java.util.Scanner;

public class CharacterString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        char ch = s.charAt(n);
        System.out.println(ch);
    }
}
