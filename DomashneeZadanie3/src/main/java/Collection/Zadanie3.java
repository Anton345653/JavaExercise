package Collection;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Zadanie3 {
    public static void main(String[] args) {
      Object[] ks=new Object[5];
      for(int i=0;i<ks.length;i++){
          ks[i]=i+1;
      }
        System.out.println(Arrays.toString(ks));
      arrayToMap(ks);
        System.out.println();


    }

    public static <K>Map<K,Integer> arrayToMap(K[] ks){
        Map<K,Integer> map=new HashMap<>();
        for(K key:ks){
            if(!map.containsKey(key)){
                map.put(key,0);
            }
            map.put(key,map.get(key).intValue()+1);
        }
        System.out.println(map);
        return map;
    }
}


