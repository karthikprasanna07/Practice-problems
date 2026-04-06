package Strings;
// check whether a string is a rotated version of another string
public class StringRotation {
    public static void main(String[] args) {
        String s1 = "abcdef";
        String s2 = "cdefab";
        System.out.println(rotation(s1,s2));
    }
    public static boolean rotation(String s1,String s2){
        String ans = s1.concat(s1);
        if(ans.contains(s2)){
            return true;
        }
        return false;
    }
}
