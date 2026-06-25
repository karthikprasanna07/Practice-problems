package Recursion;

public class Factorial {
    public static long fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n * fact(n-1);
    }
    public static void main(String[] args){
        System.out.println(fact(5));
    }
}
        /*
        fact(5)
        └── fact(4)
            └── fact(3)
                └── fact(2)
                    └── fact(1)
                        └── returns 1
                └── returns 2
           └── returns 6
        └── returns 24
    └── returns 120*/
