package LinkedList;
import java.util.*;
public class Search {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;
    public void insertAtLast(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
            return;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    public int search(int x){
        if(head == null){
            System.out.println("LINKED LIST IS EMPTY");
        }
        int pos = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            pos++;
            if(temp.data == x){
                return pos;
            }
        }
        return -1;
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Search s = new Search();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            s.insertAtLast(sc.nextInt());
        }
        s.print();
        int x = sc.nextInt();
        int result = s.search(x);
        if(result == -1){
            System.out.println("Element not found");
        }
        else{
            System.out.println(result);
        }

    }
}
