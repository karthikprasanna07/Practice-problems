package OOPS;

class MyClass1{
    String name;
    static int rollno;

    public void show(){
        System.out.println("name : " + name + " rollno : " + rollno);
    }
    // non static variable cannot be used inside a static method
    public static void show1(){
        System.out.println("rollno : " + rollno);
    }


}
public class StaticVariable {
    public static void main(String[] args) {
        MyClass1 obj = new MyClass1();
        obj.name = "karthik";
        MyClass1.rollno = 51;
        obj.show();
        MyClass1.show1();

    }
}
/*
static variable is common for all objects and a single change in that value will reflect for all objects
 */