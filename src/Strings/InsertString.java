package Strings;

import java.util.Scanner;

public class InsertString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String orgstr = sc.nextLine();
        System.out.println("string to be added : ");
        String tobeadded = sc.nextLine();
        System.out.println("enter the index of insertion : ");
        int x = sc.nextInt();
        System.out.println(insert(orgstr,tobeadded,x));
    }
    public static String insert(String orgstr, String tobeadded,int index){
        String newstr = new String();
        for (int i = 0; i < orgstr.length() ; i++) {
            newstr += orgstr.charAt(i);
            if(i==index){
                newstr = newstr + tobeadded + " ";
            }
        }
        return newstr;

    }
    //use substring method also
   /* public static String insertinto (String orgstr,String tobeadded,int index){
        String ans = orgstr.substring(0,index+1) + tobeadded + orgstr.substring(index);
        return ans;
    }*/
}
