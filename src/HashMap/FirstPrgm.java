package HashMap;

import java.util.HashMap;
import java.util.Map;

public class FirstPrgm {
    public static void main(String[] args) {
        HashMap<String,Integer> hashMap = new HashMap<>(); //create
        hashMap.put("karthik", 21);
        hashMap.put("dinesh", 25);

       /* for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println(entry.getKey() + "->" + entry.getValue());
        }*/
        // read :
        for (String key : hashMap.keySet()){
            System.out.println("key :" + key + "value :" + hashMap.get(key));
        }
         //Note : order is not guaranteed
        //update :
        hashMap.put("dinesh", 36);
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("modified hashmap : "+entry.getKey() + "->" + entry.getValue());
        }
        //remove :
        hashMap.remove("karthik"); // deletes that key and value pair
        for (Map.Entry<String, Integer> entry : hashMap.entrySet()){
            System.out.println("modified hashmap after remove : "+entry.getKey() + "->" + entry.getValue());
        }
        hashMap.clear(); // removes all values from hashmap
        hashMap.containsKey("dinesh"); // checks whether a key is present or not
        hashMap.size(); //number of elements
        hashMap.isEmpty(); //checks if hashmap is empty or not
        hashMap.getOrDefault("ravi", 0); // if key is present then return its value or else return 0
        hashMap.putIfAbsent("karthik",100); //adds only if key is not present
    }
}
