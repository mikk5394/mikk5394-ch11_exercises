package ch11;
import java.util.*;
/*
Write a method called rarest that accepts a map whose keys are strings and whose values are integers as a parameter
and returns the integer value that occurs the fewest times in the map. If there is a tie, return the smaller integer value. If
If the map is empty, throw an exception
 */
public class ch11_19 {
    public static void main(String[] args) {

        Map<String, Integer> map = new HashMap<>();

        map.put("yo", 1);
        map.put("hej", 3);
        map.put("med", 5);
        map.put("dig", 7);
        map.put("min", 3);
        map.put("ven", 7);

        System.out.println("Integer value that appear the least in the given map: " + rarest(map));
    }

    public static int rarest (Map<String, Integer> map) {

        Map<Integer, Integer> tempMap = new HashMap<>();
        // Omskriver value ints til int keys for så derefter at bruge de omskrevne keys til at tælle hvor mange gange
        // de forskellige values går igen.
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            int num = map.get(entry.getKey());
            if (tempMap.containsKey(num)) {
                tempMap.put(num, tempMap.get(num) + 1);
            } else {
                tempMap.put(num, 1);
            }
        }
        // Overfører keysettet til et set og benytter derefter en iterator til at finde frem til den int som
        // forekommer færrest gange.
        // Da sets sorterer ints efter størrelse (med den laveste først), vil den laveste int blive returneret hvis
        // der er flere keys som forekommer det samme antal gange
        Set<Integer> tempSet = tempMap.keySet();
        Iterator<Integer> itr = tempSet.iterator();
        Integer min = itr.next();
        // Iteratoren kører keysettet igennem og henter en value frem ud fra hver key (values blev kodet
        // længere oppe til at vise hvor mange gange hver key int forekommer).
        // 'min' variablen bliver så sat til den key int som forekommer færrest gange
        while(itr.hasNext()) {
            Integer current = itr.next();
            if (tempMap.get(current) < tempMap.get(min)) {
                min = current;
            }
        }
        return min;
    }
}
