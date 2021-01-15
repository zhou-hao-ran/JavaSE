package org.neuedu.chapter15.Demo8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Demo2 {
    public static void main(String[] args) {
        Map<String,Integer> map=new HashMap<>();
        map.put("java1",12);
        map.put("java2",22);
        map.put("java3",32);
        map.put("java4",42);
        for (Map.Entry<String,Integer> entry:map.entrySet()){
            System.out.println(entry.getKey()+","+entry.getValue());
        }
        Set<String> set=map.keySet();
        for (String key:set){
            System.out.println(key+","+map.get(key));
        }
        //Set<Map.Entry<String,Integer>> set=map.entrySet();
        //for (Map.Entry<String,Integer> entry:set){
        //    System.out.println(entry.getKey()+","+entry.getValue());
        //}
    }
}
