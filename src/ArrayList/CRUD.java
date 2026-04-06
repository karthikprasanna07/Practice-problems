package ArrayList;

import java.util.ArrayList;

public class CRUD {
    public static void main(String[] args) {
        /*create*/ArrayList<Integer> al = new ArrayList<>();
        al.add(0,1);
        al.add(1,2);
// delete        al.remove((Integer) 2);
       /*update*/ al.set(1,8);
        System.out.println(al);
    }
}
