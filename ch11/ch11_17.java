package ch11;
import java.util.*;
/*
Write a method called subMap that accepts two maps from strings to strings as its parameters and returns true if
every key in the first map is also contained in the second map and maps to the same value in the second map. For
example, {Smith=949–0504, Marty=206–9024} is a submap of {Marty=206–9024, Hawking=123–4567,
Smith=949–0504, Newton=123–4567}. The empty map is a submap of every map.
 */
public class ch11_17 {
    public static void main(String[] args) {

        Map<String, String> map1 = new HashMap<>();
        Map<String, String> map2 = new HashMap<>();

        map1.put("Smith", "949-0504");
        map1.put("Marty", "206-9024");

        map2.put("Marty", "206-9024");
        map2.put("Hawking", "123-4567");
        map2.put("Smith", "949-0504");
        map2.put("Newton", "123-4567");

        System.out.println(subMap(map1,map2));
    }

    private static boolean subMap (Map<String, String> map1, Map<String, String> map2){

        // Looper igennem mit første map for at sammenligne pairs med map2 for at se om de indgår der også.
        // Hvis et pair eller mere ikke indgår i det andet map vil counteren ikke være true længere nede.
        int count = 0;
        for (Map.Entry<String, String> entry : map1.entrySet()){
            if(map2.containsKey(entry.getKey()) && map2.containsValue(entry.getValue())){
                count++;
            } else {
                count--;
            }
        }
        if (count == map1.size()){
            return true;
        } else {
            return false;
        }
    }

}
