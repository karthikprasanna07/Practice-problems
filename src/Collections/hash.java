package Collections;
import java.util.*;
public class hash {
    public static void main(String[] args){
        int[] a = {2,4,1,5,1,6};
        Set<Integer> s = new TreeSet<>(); //  preserves the order of the elements in ascending order
        for(int i:a){
            s.add(i);
        }
        System.out.println(s);
    }
}
