package ch11;
/*
Write a method countUnique that accepts a list of integers as a parameter and returns the number of unique integer
values in the list. Use a set as auxiliary storage to help you solve this problem. For example, if a list contains the values
[3, 7, 3, –1, 2, 3, 7, 2, 15, 15], your method should return 5. The empty list contains 0 unique values.
 */
import java.util.*;

public class ch11_6 {
    public static void main(String[] args) {

        LinkedList<Integer> liste = new LinkedList<>();

        liste.add(3);
        liste.add(7);
        liste.add(3);
        liste.add(-1);
        liste.add(2);
        liste.add(3);
        liste.add(7);
        liste.add(15);
        liste.add(15);

        System.out.println("List before counting the number of uniques: " + liste);
        System.out.println();
        System.out.println("Number of unique numbers in the submitted list: " + countUnique(liste));

    }

    public static int countUnique(LinkedList<Integer> list){

        // Laver et set for at fjerne duplicates fra min linkedlist da sets ikke kan indeholde duplicates.
        Set<Integer> uniqueCount = new HashSet<>();
        // tilføjer alle Ints fra den givne Linkedlist som ikke er duplicates.
        uniqueCount.addAll(list);

        // returnerer size da det er en int og giver derved et tal på
        // hvor mange uniques som forekommer i den givne linkedlist.
        return uniqueCount.size();
    }

}
