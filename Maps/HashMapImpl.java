package Maps;

import QueueImpl.StudentsMarksForPQ;

import java.util.*;

public class HashMapImpl {
    public static void main(String[] main){
        Map<String , Integer> maps = new HashMap<>();
        maps.put("Rutu" , 99);
        maps.put("Rohit" , 98);
        maps.put("Quagmire" , 97);
        System.out.println(maps); //{Rohit=98, Rutu=99, Quagmire=97}
        maps.remove("Rohit");
        System.out.println(maps.get("Rutu")); //99
        System.out.println(maps.get("ThisKeyDoesNotExist"));//null
        //Default type in this case should be INT
        System.out.println(maps.getOrDefault("RandomKey" , 0));

        System.out.println(maps.containsKey("Rutu")); // true
        System.out.println(maps.containsKey("Lmao")); // false

        Map<Integer , List<Integer>> adj = new HashMap<>();
        adj.put(2, new ArrayList<>());
//        if(adj.get(1) == null){
//            adj.put(1 , new ArrayList<>());
//            adj.get(1).add(99);
//        }
        ///Or in 1 line
        adj.computeIfAbsent(1 , f -> new ArrayList<>()).add(99);
        adj.get(2).add(22);

        Set<Map.Entry<String , Integer>> entrySet = maps.entrySet();
        for(Map.Entry<String , Integer> entry : entrySet) {
            System.out.println(entry.getKey() + "," + entry.getValue());
        }


    }
}
