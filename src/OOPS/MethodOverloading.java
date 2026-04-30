package OOPS;

class MyClass {
    public int add(int n1, int n2){
        return n1+n2;
    }
    public int add(int n1, int n2, int n3){
        return n1+n2+n3;
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        MyClass obj = new MyClass();
        System.out.println(obj.add(1,2));
        System.out.println(obj.add(1,2,5));
    }
}
