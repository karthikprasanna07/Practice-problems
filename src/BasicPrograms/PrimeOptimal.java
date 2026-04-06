package BasicPrograms;

import java.util.Scanner;

public class PrimeOptimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        for(int i =2; i < num/2; i++) {
            if(num % i == 0){
                System.out.println("not prime");
                return;
                // return podla na neraya tym not prime nu print aagum
            }
        }
        System.out.println("prime");
    }
}
