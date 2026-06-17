package Exception;

public class CustomException {
    static class FunnyException extends Exception{
        public FunnyException(String message){
            super(message);
        }
    }
    public static void main(String[]args){
        int a = 10;
        int b = 10;
        try{
            if(a/b==1){
                throw new FunnyException("Okay divide panlam");
            }
        }
        catch(FunnyException e){
            System.out.println(e.getMessage());
        }
        catch(Exception e){
            System.out.println(e);
        }
        finally{
            System.out.println("Nothing");
        }
        System.out.println(a/b);
    }
}
