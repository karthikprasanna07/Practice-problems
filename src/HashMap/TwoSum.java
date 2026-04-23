package HashMap;

import java.util.HashMap;

public class TwoSum {
    public static void main(String[] args) {
        int[] arr = {2,7,11,15};
        int target = 9;
        System.out.println(twosum(arr,target));// array value doesnt print here

    }
    static int[] twosum(int[] arr,int target){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0;i<arr.length;i++){
            int needed = target - arr[i];
            if(map.containsKey(needed)){
                return new int[]{map.get(needed),i};
            }
            else{
                map.put(arr[i],i);
            }
        }
        return new int[]{-1, -1};
    }
}
