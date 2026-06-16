package Sem7;

import java.util.Random;

public class RandomNum {
    public static void main(String[] args){
        Random rand = new Random();
        int k = rand.nextInt(1000,3000);
        System.out.println(k);
    }
}
