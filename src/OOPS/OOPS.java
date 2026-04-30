package OOPS;

class Calculator{
    public int add(int n1, int n2){
        int result =  n1 + n2;
        return result;
    }
}
public class OOPS {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.add(3,4));
    }
}
