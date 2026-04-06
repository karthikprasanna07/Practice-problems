package Patterns;

import java.util.Scanner;

public class NumberPattern8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 0; i <=n ; i++) {
            for (int j = 0; j <=n ; j++) {
                if ((i==0)||(j==0)||(j==2)||(i==n)){
                    System.out.print("3 ");
                }
                else {
                    System.out.println(i);
                }
            }
        }
        System.out.println();
    }
}
