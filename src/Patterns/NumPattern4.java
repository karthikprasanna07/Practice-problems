package Patterns;

import java.util.Scanner;

public class NumPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <=n ; i++) {
            int num = i;
            for (int j = 1; j <=i ; j++) {
                if(j!=i){
                    System.out.print(num+" ");
                }
                else{
                    System.out.print(num+4+" ");
                }
            }
            System.out.println();
        }
    }
}
