package HashMap;

import java.util.HashMap;

public class FrequencyCount {
    public static void main(String[] args) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int[] arr = {1,2,2,4,5,5,1,4,4};
        for (int num : arr){
            hm.put(num, hm.getOrDefault(num,0)+1);
        }
        for (int key : hm.keySet()){
            System.out.println("key : " + key + " value : "+ hm.get(key));
        }
    }

}
