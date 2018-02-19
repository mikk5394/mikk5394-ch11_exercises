package ch11;
/*
Write a method removeOddLength that accepts a set of strings as a parameter and that removes all of the strings of
odd length from the set.
 */
import java.util.*;

public class ch11_10 {
    public static void main(String[] args) {

        Set<String> set = new HashSet<>();

        set.add("123");
        set.add("1234");
        set.add("12345");
        set.add("123456");

        System.out.println(removeOddLength(set));


    }

    public static Set<String> removeOddLength (Set<String> set){

        Set<String> tempSet = new HashSet<>();
        tempSet.addAll(set);
        Iterator<String> itr = tempSet.iterator();

        while (itr.hasNext()) {

            String s = itr.next();

            if(s.length() % 2 != 0){
                itr.remove();
            }
        }
        return tempSet;
    }
}
