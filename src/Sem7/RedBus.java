package Sem7;
import java.util.*;
public class RedBus {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] twodim = new int[6][3];
        for(int i=0;i<6;i++,System.out.println()){
            for(int j=0;j<3;j++){
                System.out.print(twodim[i][j]+" ");
            }
        }
//        int size = twodim.length;
        while(true){
            if(twodim[row][col]==0 || twodim[row][col]== '+'){
                int a = 3;
                switch (a) {
                    case 1 :
                        if(twodim[row][col]==0){
                            System.out.println("Seat is Empty");
                        }
                        break;
                    case 2:
                        if(twodim[row][col]=='+'){
                            System.out.println("Seat is Booked");
                        }
                        break;
                    default:

                }

            }
        }
    }
}
