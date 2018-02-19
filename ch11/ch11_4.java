package ch11;

import java.util.*;
/*
Write a method called partition that accepts a list of integers and an integer value E as its parameter, and rearranges
(partitions) the list so that all the elements with values less than E occur before all elements with values greater than E.
The exact order of the elements is unimportant, so long as all elements less than E appear before all elements greater than
E. For example, for the linked list [15, 1, 6, 12, –3, 4, 8, 21, 2, 30, –1, 9], one acceptable ordering of
the list after a call of partition(list, 5) would be [–1, 1, 2, 4, –3, 12, 8, 21, 6, 30, 15, 9]. You
may assume that the list contains no duplicates and does not contain the element value E
 */
public class ch11_4 {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();

        list.add(5);
        list.add(11);
        list.add(12);
        list.add(-2);
        list.add(2);
        list.add(7);
        list.add(-9);
        list.add(1);
        list.add(4);

        int e = 6;

        System.out.println("Before sorting with " + e + ": " + list);
        System.out.println();
        System.out.println("After sorting with " + e + ": " + partition(list,e));
    }

    public static LinkedList<Integer> partition (LinkedList<Integer> listOfIntegers, int E){

        //
        LinkedList<Integer> lowerThanE = new LinkedList<>();
        LinkedList<Integer> biggerThanE = new LinkedList<>();

        int count = 0;
        while (listOfIntegers.size() > count){
            //fylder to lister op - den ene med alle tal under E og den anden med alle tal over E.
            if (listOfIntegers.get(count) < E){
                lowerThanE.add(listOfIntegers.get(count));
                count++;
            } else {
                biggerThanE.add(listOfIntegers.get(count));
                count++;
            }
        }
        // Lægger de to lister sammen for at opfylde kravet om at alle elementer med lavere
        // værdi end E skal forekomme før elementer med større værdi end E.
        lowerThanE.addAll(biggerThanE);

        return lowerThanE;
    }
}