package ch11;
import java.util.*;
/*
Write a method called is1to1 that accepts a map whose keys and values are strings as its parameter and returns true if
no two keys map to the same value. For example, {Marty=206–9024, Hawking=123–4567, Smith=949–0504, Newton=123–4567}
should return false, but {Marty=206–9024, Hawking=555–1234, Smith=949–0504, Newton=123–4567}
should return true. The empty map is considered 1-to-1 and returns true.
 */
public class ch11_16 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Marty", "206-9024");
        map.put("Hawking", "123-4567");
        map.put("Smith", "949-0504");
        map.put("Newton", "123-4567");

        System.out.println(is1to1(map));
    }

    public static boolean is1to1 (Map<String, String> map){

        //Opgaven er en kopi af opg. 13?
        Set<String> tempSet = new TreeSet<>();

        for (Map.Entry<String, String> entry : map.entrySet()){
            tempSet.add(entry.getValue());
        }

        if (tempSet.size() == map.size()){
            return true;
        }
        return false;
    }
}
