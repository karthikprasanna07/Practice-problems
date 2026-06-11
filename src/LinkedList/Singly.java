package LinkedList;

public class Singly {
    class Node{
        int data;
        Node next;
        public Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;//initialize head cos head irundha dhan traverse pana mudiyum
    public void insertAtFirst(int data){
        Node n = new Node(data); // n is the new node that is going to be inserted
        n.next = head;
        head = n;
        return;
    }
    public void insertAtLast(int data){
        Node n = new Node(data);
        if(head == null){
            head = n;
        }
        Node temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
    public void insertAtMid(int data,int pos){
        Node n = new Node(data);
        Node temp = head;
        if(head == null){
            head = n;
        }
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        n.next = temp.next;
        temp.next = n;

    }
    public void delAtFirst(){
        Node temp = head;
        if(head == null){
            System.out.println("Cannot delete.");
        }
        head = head.next;
    }
    public void delAtLast(){
        Node temp = head;
        if(head == null){
            System.out.println("Invalid operation");
        }
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }
    public void delAtPosition(int pos){
        Node temp = head;
        for(int i=1;i<pos-1;i++){
            temp = temp.next;
        }
        temp.next = temp.next.next;
    }
    public boolean search(int target){
        Node temp = head;
        if(head == null){
            System.out.println("Cannot perform search");
        }
        while(temp!=null){
            if(temp.data == target){
                return true;
            }
            temp = temp.next;
        }
        return false;
    }
    public void reverse(){
        int size = 0;
        Node temp = head;
        while(temp!=null){
            size++;
            temp = temp.next;
        }
        for(int i=size-1;i>0;i--){
            System.out.print(temp.data);
        }
    }
    public void print(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println("NULL");
    }
    public static void main (String[]args){
        Singly s = new Singly();
        s.insertAtFirst(1);
        s.insertAtFirst(2);
        s.insertAtFirst(3);
        s.insertAtFirst(4);
        s.insertAtFirst(7);
        s.reverse();
        s.print();
    }
}
