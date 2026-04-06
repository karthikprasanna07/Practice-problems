package BasicPrograms;

import java.util.Scanner;

public class CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a num:");
        int count = 0;
        int num = sc.nextInt();
        while(num >0){
            num /= 10;
            count++;
        }
        System.out.println(count);
    }
}
