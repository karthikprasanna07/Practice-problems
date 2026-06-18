package Thread;

public class New {
    static class c1 extends Thread{
        public void run1(){
            for(int i=1;i<=5;i++){
                System.out.print (i+" ");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("Data interrupted");
                }
            }
        }
    }
    static class c2 extends Thread{
        public void run2(){
            for(char i=97;i<=101;i++){
                System.out.print(i+" ");
                try{
                    Thread.sleep(2000);
                }catch(InterruptedException e){
                    System.out.println("Data interrupted");
                }
            }
        }
    }
    public static void main(String[] args){
        c1 c = new c1();
        c.run1();
        c2 cn = new c2();
        cn.run2();
    }
}
