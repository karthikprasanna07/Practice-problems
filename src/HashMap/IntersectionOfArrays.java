package HashMap;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class IntersectionOfArrays {
    public static void main(String[] args){

    }
    static int[] intersect(int[] nums1, int[] nums2){
        HashMap<Integer, Integer> hm = new HashMap<>();
        int[] result = new int[hm.size()];
        for(int i=0;i<nums1.length;i++){
            for(int j =0;j<nums2.length;j++){
                hm.put(nums1[i],i);
            }
        }
        for(Map.Entry<Integer, Integer> entry : hm.entrySet()){
            Integer value = entry.getValue();
            if(value<1){
                Arrays.fill(result, value);
            }
        }
        return result;
    }
}
