package HashMap;

import java.util.Collections;
import java.util.HashMap;

public class MostFreqElem {
    public static void main(String[] args) {
        int[] arr = {1,2,2,3,3,3,1};
        findelem(arr);

    }
    static void findelem(int[] arr){
        HashMap<Integer, Integer> map = new HashMap<>();
        int maxcount = 0;
        int ans = 0;

        for(int num : arr){
            int count = map.getOrDefault(num,0) +1;
            map.put(num,count);

            if(count>maxcount){
                maxcount = count;
                ans = num;
            }
        }
        System.out.println("most freq elem is : " + ans);
    }
}
