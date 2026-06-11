package Stack;

public class LLImpl {
    class Stack{
        int data;
        Stack next;
        public Stack(int data){
            this.data = data;
            this.next = null;
        }
    }
    Stack head;
    public void Push(int data){
        Stack n = new Stack(data);
        if(head == null){
            head = n;
        }
        Stack temp = head;
        while(temp.next!=null){
            temp = temp.next;
        }
        temp.next = n;
    }
   /* public void pop(int data){
        Stack n = new Stack(data);
        Stack temp = head;
        while(temp.next.next!=null){
            temp = temp.next;
        }
        temp.next = null;
    }*/
    public void print(){
        Stack temp = head;
        while(temp!=null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[]args){
        LLImpl l = new LLImpl();
        l.Push(1);
        l.Push(2);
        l.Push(3);
        l.Push(4);
        l.print();
    }
}
