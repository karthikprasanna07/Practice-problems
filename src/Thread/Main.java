package Thread;

public class Main extends Thread {
    @Override
    public void run() {
        int a = 5;
        for (int i = 1; i <= a; i++) {
            System.out.print(i + "  ");
            try{
                Thread.sleep(2000);
            } catch(InterruptedException e){
                System.out.println("Data Interuppted");
            }
        }
    }
    public void run2(){
        int a = 5;
        for(char i =97;i<=101;i++){
            System.out.print(i+" ");
            try{
                Thread.sleep(2000);
            } catch (InterruptedException e){
                System.out.println("Data Interuppted");
            }
        }
    }
        public static void main (String[] args){
            Main m = new Main();
            Thread t = new Thread(m);
            t.start();
            Thread t1 = new Thread(()->m.run2());
            t1.start();
        }
    }
