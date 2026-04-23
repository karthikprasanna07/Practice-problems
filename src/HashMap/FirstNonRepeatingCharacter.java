package HashMap;

import java.util.HashMap;
import java.util.Scanner;

public class FirstNonRepeatingCharacter {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter a string : ");
        String s = sc.nextLine();
        check(s);
    }
    static void check(String s1){
        HashMap<Character,Integer> hm = new HashMap<>();
        for(char ch : s1.toCharArray()){
            if(hm.containsKey(ch)){
                int count = hm.get(ch);
                hm.put(ch, count+1);
            }
            else{
                hm.put(ch,1);
            }
        }
        for(char ch : s1.toCharArray()){
            if(hm.get(ch) == 1){
                System.out.println(ch);
                return; //finds the first non repeating character and stops the prgm immediately
            }
        }
    }
}
