package Program_14.HashMap;

import Second_program.Strng;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class HashMapDemo {
    public static void main(String[] args) {

        HashMap<String, Integer> map = new HashMap<>();

        //To insert the value in the Map use put keyword

        map.put("India", 1000);
        map.put("USA", 700);
        map.put("UK", 800);
        map.put("Nepal", 900);
        map.put("Russia", 780);
        map.put("Bhutan", 987);

        System.out.println(map);

        //to update use the put keyword again
        map.put("India",1500);
        System.out.println(map);

        //to remove
        map.remove("USA");
        System.out.println(map);

        //to get the value of a key use get keyword
        System.out.println(map.get("India"));

        //to check the existence of the key
        System.out.println(map.containsKey("UK"));

        System.out.println("***************KEYS*********************");

        //to get the keys in the Hashmap use the keySet keyword
        // it will give the data in the form of Set
        //and then use the for loop to get all the keys
        Set<String> keys=map.keySet();
        for (String key: keys ) {
            System.out.println(key);

        }

        //to get the values in the Hashmap use the values()  and Collection
        // it will give the data in the form of collection
        System.out.println("*****************VALUES*******************");
        Collection<Integer> values=map.values();
        for (Integer value:values) {
            System.out.println(value);
            
        }

        System.out.println("***************Getting Both Key and value*****************");
        Set<Map.Entry<String,Integer>> entries=map.entrySet();
        for (Map.Entry<String,Integer> entry: entries  ) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());

        }


    }

}