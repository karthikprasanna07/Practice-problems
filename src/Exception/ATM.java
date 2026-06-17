package Exception;
import java.util.*;
public class ATM {
    static class InvalidAmountException extends Exception{
        public InvalidAmountException(String message){
            super(message);
        }
    }
    static class InsufficientBalanceException extends Exception{
        public InsufficientBalanceException(String message){
            super(message);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int balance = sc.nextInt();
        int amount = sc.nextInt();
        try{
            if(amount<=0){
                throw new InvalidAmountException("Invalid withdrawal Amount");
            }
            if(amount>balance){
                throw new InsufficientBalanceException("Insufficient Balance");
            }
        }
        catch(InvalidAmountException e){
            System.out.println(e.getMessage());
        }
        catch(InsufficientBalanceException e){
            System.out.println(e.getMessage());
        }
        if(amount < balance && amount > 0){
            System.out.println("Remaining balance : " + (balance - amount));
        }

    }
}
