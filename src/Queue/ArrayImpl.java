package Queue;
import java.util.*;
public class ArrayImpl {
     static class Queue{ // make static to call from main method
        int capacity;
        int front;
        int rear = -1;
        int data;
        int arr[];
        int limit;
        public Queue (int size){
            this.arr = new int[size];
            capacity = size;
            front = 0;
            rear = -1;
        }
        public void Enqueue(int data){
            if(rear == capacity - 1){
                System.out.println("Queue is full");
                return;
            }
            arr[++rear] = data;
            limit++;
        }
        public int Dequeue(){
            if(rear == -1){
                System.out.println("Queue is empty");
            }
            int temp = arr[front];
            front++;
            return temp;
        }
        public int peek(){
            if(rear == -1){
                System.out.println("Queue is empty");
            }
            int temp = arr[front];
            return temp;
        }
        public boolean isFull(){
            return rear == capacity -1;
        }
        public void print(){
            if(rear == -1){
                System.out.println("Queue is empty cannot print");
            }
            for(int i=front;i<capacity;i++){
                System.out.print(arr[i]+" ");
            }
        }
        public boolean search(int target){
            for(int i=front;i<capacity;i++){
                if(arr[i] == target){
                    return true;
                }
            }
            return false;
        }

        /*public int[]min (){
            int[] min = new int[capacity];
            if(capacity == -1){
                System.out.println("Queue is empty");
            }
            for(int i=0;i<capacity;i++){
                for(int j=i+1;j<capacity;j++){
                    if()
                }

            }
        }*/
     }
    public static void main(String[]args){
        Queue q = new Queue(5);
        q.Enqueue(5);
        q.Enqueue(4);
        q.Enqueue(2);
        q.Enqueue(1);
        q.Enqueue(3);
//        q.min();
        q.print();

    }
}
