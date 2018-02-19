package ch11;
/*
Write a method countCommon that accepts two lists of integers as parameters and returns the number of unique integers
that occur in both lists. Use one or more sets as storage to help you solve this problem. For example, if one list contains
the values [3, 7, 3, –1, 2, 3, 7, 2, 15, 15] and the other list contains the values [–5, 15, 2, –1, 7,
15, 36], your method should return 4 because the elements –1, 2, 7, and 15 occur in both lists
 */
import java.util.*;

public class ch11_7 {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<>();
        LinkedList<Integer> list2 = new LinkedList<>();

        list1.add(3);list1.add(7);list1.add(3);list1.add(-1);list1.add(2);
        list1.add(3);list1.add(7);list1.add(2);list1.add(15);list1.add(15);
        list2.add(-5);list2.add(15);list2.add(2);list2.add(-1);list2.add(7);list2.add(15);list2.add(36);

        System.out.println(list1);
        System.out.println(list2);

        System.out.println("Number of unique integers that occur in both lists: " + countCommon(list1,list2));

    }

    public static Set<Integer> countCommon(LinkedList<Integer> list1, LinkedList<Integer> list2){

        // Laver to sets til at indeholde hver sin givne liste.
        Set<Integer> tempSet1 = new TreeSet<>();
        Set<Integer> tempSet2 = new TreeSet<>();

        tempSet1.addAll(list1);
        tempSet2.addAll(list2);

        // Benytter set-metoden retainAll til at finde de elementer som forekommer i begge sets.
        // tempSet1 tjekker hvilke elementer som den og tempSet2 har til fælles og fjerner alle ikke-fælles elementer.
        tempSet1.retainAll(tempSet2);

        return tempSet1;
    }

}
