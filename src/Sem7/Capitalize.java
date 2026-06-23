package Sem7;

import java.util.*;

public class Capitalize {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        String[] arr = new String[size];
        for(int i=0;i<size;i++){
            arr[i] = sc.nextLine();
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i].length()>0){
                String a = arr[i].toLowerCase();
                arr[i] += a.substring(0,1).toLowerCase()+a.substring(1);
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
