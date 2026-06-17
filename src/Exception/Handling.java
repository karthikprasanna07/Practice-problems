package Exception;

public class Handling {
    public void main (String[]args){
        String s = null;
        if(s.length()>0){
            System.out.println(s); // null pointer exception
        }
        int a  = 10;
        int b = 0;
        try{
            System.out.println(a/b);
        }
        catch(ArithmeticException e){
            System.out.println(e);
        }
        /*printStackTrace()
        * getMessage()
        * toString()
        * getCause() -> Throwable
        * getStackTrace()
        * */
    }
}
