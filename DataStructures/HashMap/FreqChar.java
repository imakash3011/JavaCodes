package Program_14.HashMap;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class FreqChar {
    public static void main(String[] args) {
        String str="aabbaaabcdda";
        System.out.println(getMaxFerq(str));


    }
    public static char getMaxFerq(String str){
        HashMap<Character,Integer> map=new HashMap<>();
        for (int i = 0; i <str.length() ; i++) {
            char cc=str.charAt(i);
            //if key is already present then update values data
            //otherwise put that value together with its value
            if(map.containsKey(cc)){
                int oldv=map.get(cc);
                int newv=oldv+1;
                map.put(cc,newv);
            }else {
                map.put(cc,1);
            }

        }
        //  '\0' represents the null character
        char maxchar='\0';
        int max=0;
        Set<Map.Entry<Character,Integer>> enteries=map.entrySet();
        for (Map.Entry<Character,Integer> entry:enteries ) {
            if(entry.getValue()>max){
                max=entry.getValue();
                maxchar=entry.getKey();
            }

        }
        return maxchar;
            }
}
