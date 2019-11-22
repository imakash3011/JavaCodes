package Program_14.HashMap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class IntersectionArray {
    public static void main(String[] args) {

        int [] one={5,1,3,4,7};
        int [] two={2,4,3,5,7,10,15};
        ArrayList<Integer> list=getIntersection(one,two);
        System.out.println(list);

    }

    public static ArrayList<Integer> getIntersection(int one[], int two[]) {
        HashMap<Integer,Boolean> map=new HashMap<>();

        //firstly take the first array and put it into the hashmap by setting its value false by default
        ArrayList<Integer> list=new ArrayList<>();
        for (int i = 0; i <one.length ; i++) {
            map.put(one[i],false);
        }
        //now for second array if same key is present then replace false value by true
        //and we need not to do anything if the key is not same or not present
        for (int j = 0; j <two.length ; j++) {
            if(map.containsKey(two[j])){
                map.put(two[j] ,true);
            }

        }
        Set<Map.Entry<Integer,Boolean>> entries=map.entrySet();

        for (Map.Entry<Integer,Boolean> entry:entries) {
            //if the entry whose value is true ,put it in different list and then return it
//            if(entry.getValue()==true)    or by default it will take true vale
            if(entry.getValue()){
                list.add(entry.getKey());
            }

        }
        return  list;
    }


}
