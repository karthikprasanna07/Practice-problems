package BasicPrograms;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        float d;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a = sc.nextInt();
        System.out.println("Enter a float:");
        float b = sc.nextFloat();
        d = a+b;
        System.out.println(d);
    }
}
