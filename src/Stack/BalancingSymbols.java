package Stack;

import java.util.Stack;

public class BalancingSymbols {
    public static void main(String[] args) {
        int size = 7;
        char [] stack = new char[size];
        int top = -1;
        String s1 = "{([]}";
        for (int i = 0; i < s1.length() ; i++) {
            char ch = s1.charAt(i);
            if (ch == '{' || ch=='[' || ch=='('){
                stack[++top]=ch;
            }
            if(ch == '}' || ch == ']' || ch == ')'){
                char c = stack[top--];
            }
        }
        if (top==-1){
            System.out.println("valid");
        }
        else {
            System.out.println("invalid");
        }
    }
}
