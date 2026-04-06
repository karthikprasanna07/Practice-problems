package Patterns;

import java.util.Scanner;

public class NumberPattern7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int num = 1;
        for (int i = 1; i <=n ; i++) {
            for (int j = 1; j <=i ; j++) {
                if(i%2!=0){
                    System.out.print(num);
                    num++;
                }
            }
            System.out.println();

        }


    }
}
