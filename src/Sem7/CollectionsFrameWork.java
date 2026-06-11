package Sem7;
import java.util.*;
public class CollectionsFrameWork {
    public static void main(String[]args){
        Collection<String> s= new ArrayList<>();
        s.add("a");
        s.add("b");
        s.add("c");
        s.add("d");
        List<String> s1= new ArrayList<>();
        s1.add("1");
        s1.add("2");
        s1.add("3");
        s1.add("4");
        s1.addAll(s);
        System.out.println(s1);
    }
}
