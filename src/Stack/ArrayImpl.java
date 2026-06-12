package Stack;

public class ArrayImpl {
    static class Stack{
        int capacity;
        int top;
        int arr[];
        public Stack(int size){
            arr = new int[size];
            capacity = size;
            top = -1;
        }

    public void push(int data){
        if(isfull()){
            System.out.println("Stack is overflow");
            return;
        }
        arr[++top] = data;
    }

    public boolean isfull(){
        return top == capacity -1;
    }

    public boolean isempty(){
            return top == -1;
    }

    public void pop(){
        if(isempty()){
            System.out.println("Stack underflow");
            return;
        }
        arr[top--] = arr[top];
        }
    }

    public void print(){

    }
    public static void main(String[]args){
        Stack s = new Stack(5);
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
    }
}
