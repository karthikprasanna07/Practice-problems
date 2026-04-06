package Arrays;

import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.Arrays;

public class TwoDim {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int row  = sc.nextInt();
        System.out.println("enter no of cols : ");
        int col = sc.nextInt();
        int[][] arr = new int[row][col];
        for (int i = 0; i < row ; i++) {
            for (int j = 0; j < col ; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }
}
