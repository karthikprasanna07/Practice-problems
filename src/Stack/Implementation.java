package Stack;
import java.util.Stack;

import com.sun.tools.javac.Main;

public class Implementation {
    int size = 5;
    int[] stack = new int[size];
    int top = -1;
    void push(int a){
        if(size-1==top){
            System.out.println("stack is full");
        }
        else{
            stack[++top] = a;
            System.out.println(stack[top]);
        }
    }
    int pop(int b){
        int x = 0;
        if (top == -1){
            System.out.println("stack is empty");
        }
        else{
            x = stack[top--];
        }
        return x;
    }
    public static void main(String[] args) {
        Implementation im = new Implementation();
        im.push(10);
        im.pop(1);
    }
}
