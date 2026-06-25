package Sem7;
import java.util.*;
public class StringPosition {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int position = 0;
        for(int i=0;i<s.length();i++){
            char ch = Character.toLowerCase(s.charAt(i));
            if(Character.isLetter(ch)){
                position = ch - 'a' + 1;
                System.out.print(position+" ");
            }
        }
    }
}
