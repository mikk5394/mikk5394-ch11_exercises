package ch11;
/*
Write a method minLength that accepts a set of strings as a parameter and that returns the length of the shortest
string in the list. If your method is passed an empty set, it should return 0.
 */
import java.util.*;

public class ch11_8 {
    public static void main(String[] args) {

        Set<String> set1 = new HashSet<String>();

        set1.add("salam");
        set1.add("ejjjjjj");
        set1.add("allo");
        set1.add("bum");
        set1.add("hi");
        set1.add("hallihallo");
        set1.add("mikkel");

        System.out.println(minLength(set1));
    }

    public static int minLength (Set<String> set){

        if (set.isEmpty()){
            return 0;
        }
        int shortest = 100;

        for (String s : set){
            if (s.length()<shortest){
                shortest = s.length();
            }
        }
        return shortest;
    }
}
