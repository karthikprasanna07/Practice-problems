package BasicPrograms;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 0;
        for (int i = 1; i < n ; i++) {
            if(n%i==0){
                count+=i;
            }
        }
        if(n==count){
            System.out.println(n+"is perfect number");
        }
        else{
            System.out.println("not a perfect number");
        }
    }
}
