package Stack;
import java.util.*;
public class ValidParantheses {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string : ");
        String str = sc.nextLine();
        checkvalid(str);
    }
    static boolean checkvalid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch == '(' || ch == '[' || ch == '{'){
                st.push(ch);
            }
            if(ch == ')' || ch == ']' || ch == '}'){
                if(st.isEmpty()) {
                    return false;
                }
                char c = st.peek();
                if(ch=='}' && c != '{'
                        || ch == ']' && c!= '['
                        || ch == ')' && c!= '('){
                    System.out.println("INVALID");
                    return false;
                }
            }
            st.pop();
        }
        if(st.isEmpty()) {
            System.out.println("Valid");
            return true;
        }
        return false;
    }
}
