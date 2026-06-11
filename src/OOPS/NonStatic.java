package OOPS;

public class NonStatic {
    int a = 5;
    int b;
    public static void main(String[]args){
        NonStatic n = new NonStatic();
        System.out.println(n.a);
        System.out.println(n.b);
    }
}
// call a static global variable with creating an object for the class
// an empty variable will be assigned 0
