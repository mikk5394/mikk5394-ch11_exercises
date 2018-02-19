package ch11;
/*
Write a method called sortAndRemoveDuplicates that accepts a list of integers as its parameter and rearranges
the list’s elements into sorted ascending order, as well as removing all duplicate values from the list. For example,
the list [7, 4, –9, 4, 15, 8, 27, 7, 11, –5, 32, –9, –9] would become [–9, –5, 4, 7, 8, 11,
15, 27, 32] after a call to your method. Use a Set as part of your solution
 */

import java.util.*;

public class ch11_5 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(5);
        list.add(5);
        list.add(11);
        list.add(12);
        list.add(-2);
        list.add(2);
        list.add(7);
        list.add(-9);
        list.add(1);
        list.add(4);

        System.out.println(sortAndRemoveDuplicates(list));



    }

    public static Set<Integer> sortAndRemoveDuplicates(List<Integer> list){

        Set<Integer> inOrder = new TreeSet<Integer>();
        // Meget simpel opgave. Smider den givne liste ind i et TreeSet som så gør
        // resten for mig. (TreeSets sorterer og fjerner duplicates fra den liste(r) som den nu tager imod).
        inOrder.addAll(list);

        return inOrder;
    }
}

