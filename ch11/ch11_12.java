package ch11;
/*
Write a method contains3 that accepts a list of strings as a parameter and returns true if any single string occurs
at least 3 times in the list, and false otherwise. Use a map as auxiliary storage
 */

import java.lang.reflect.Array;
import java.util.*;

public class ch11_12 {
    public static void main(String[] args) {

        List<String> arrlist = new ArrayList<>();
        arrlist.add("2");
        arrlist.add("2");
        arrlist.add("3");
        arrlist.add("2");
        arrlist.add("7");
        arrlist.add("1");


        System.out.println(contains3(arrlist));

    }

    public static boolean contains3 (List<String> list){

        Map<String, Integer> tempMap = new HashMap<>();

        for (String s : list){
            tempMap.put(s,0);
        }

        for (String s : list){
            tempMap.put(s,tempMap.get(s) + 1);

        }

        ArrayList<Integer> tempList = new ArrayList<>();
        tempList.addAll(tempMap.values());

        for (Integer s: tempList){
            if (s >= 3){
                return true;
            }
        }

        return false;
    }

}
