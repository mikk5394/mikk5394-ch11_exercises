package ch11;
import java.util.*;
/*
Write a method maxOccurrences that accepts a list of integers as a parameter and returns the number of times the
most frequently occurring integer (the “mode”) occurs in the list. Solve this problem using a map as auxiliary storage.
If the list is empty, return 0.
 */
public class ch11_15 {
    public static void main(String[] args) {

        List<Integer> list = new LinkedList<>();

        list.add(10);
        list.add(10);
        list.add(10);
        list.add(30);
        list.add(10);
        System.out.println("The most frequently occuring integer appears " + maxOccurences(list) + " times");
    }

    public static int maxOccurences (List<Integer> list){

        Map<Integer, Integer> tempMap = new HashMap<>();
        Iterator<Integer> itr = list.iterator();

        // Finder først ud af hvor mange gange de forskellige ints forekommer i listen.
        while (itr.hasNext()) {
            int num = itr.next();
            if (tempMap.containsKey(num)) {
                tempMap.put(num, tempMap.get(num) + 1);
            } else {
                tempMap.put(num, 1);
            }
        }
        int max = 0;

        // int max er sat til 0 for hvis der ingen values er i mappet (bliver tjekket nedenunder)
        // skal metoden returnere 0.
        for (int count : tempMap.values()){
            if (count > max){
                max = count;
            }
        }
        return max;
    }
}

