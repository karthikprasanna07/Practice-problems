package HashMap;

import java.util.HashMap;

public class CheckDuplicateExists {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        check(arr);

    }
    static void check (int[] arr){
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int num : arr){
            if(hm.containsKey(num)){
                System.out.println("duplicate exists");
            }
            hm.put(num,1);
        }
        for (int num1 : arr){
            System.out.println("key : " + num1 + " value : " + hm.get(num1));
        }
    }
}
