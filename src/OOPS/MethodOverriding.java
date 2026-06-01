package OOPS;

class A{
    public int add (int n1, int n2){
        return n1+n2;
    }
}
class B extends A{
    public int add (int n1,int n2){
        return n1+n2+1;
        // method overriding means two methods having same name same parameters but performing different functions
        // here if i comment this function then the n1+n2 will work
        //if this function is available then this will be given 1st priority cos this is the own function of B which we have created an object
    }
}
public class MethodOverriding {
    public static void main(String[] args){
        B obj = new B();
        int r1 = obj.add(3,4);
        System.out.println(r1);
    }
}
