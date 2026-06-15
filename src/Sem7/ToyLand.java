package Sem7;
import java.util.*;
public class ToyLand {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int pos = sc.nextInt();
        int[] arr1 = new int[num];
        int[] arr2 = new int[pos];
        for(int i=0;i<num;i++){
            arr1[i] = sc.nextInt();
        }
        for(int i=0;i<num;i++){
            arr2[i] = sc.nextInt();
        }

    }
}
