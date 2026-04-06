package BasicPrograms;

import java.util.Scanner;

public class SampleCode {
    public static void main (String[] args){
        System.out.println("Enter your name:");
        Scanner sc = new Scanner(System.in);
        String Name = sc.nextLine();
        System.out.println("Enter reg no:");
        int reg_no = sc.nextInt();
        System.out.println("REGno:"+reg_no);
        System.out.println(Name);
    }
}
