package ch11;

import java.util.*;

public class ch11_11 {

    public static void main(String[] args) {

        Set<Integer> set1 = new HashSet<Integer>();
        Set<Integer> set2 = new HashSet<Integer>();

        for (int i = 1; i < 5; i++){
            set1.add(i);
        }

        for (int i = 3; i < 7; i++){
            set2.add(i);
        }
        System.out.println(set1);
        System.out.println(set2);
        System.out.println("Symmetric set difference: " + symmetricsSetDifference(set1,set2));

    }

    public static Set<Integer> symmetricsSetDifference(Set<Integer> set1, Set<Integer> set2){

        // Laver et return set
        Set<Integer> setDiffrence = new HashSet<Integer>(set1);

        // fjerner alle ints i setDifference som forekommer i set2
        setDiffrence.removeAll(set2);

        // fjerner alle ints i set2 som forekommer i set1
        set2.removeAll(set1);

        // tilføjer herefter de resterende ints i set2 (som alle med sikkerhed ikke findes i setDifference)
        // til setDifference
        setDiffrence.addAll(set2);

        // returnerer herefter en liste hvor ingen ints forekommer 2 gange
        return setDiffrence;

    }
}
