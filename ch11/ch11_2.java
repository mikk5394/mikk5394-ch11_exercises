package ch11;

import com.sun.tools.corba.se.idl.InterfaceGen;

import java.util.*;
/*
Write a method called alternate that accepts two Lists as its parameters and returns a new List containing alternating
elements from the two lists, in the following order:
• First element from first list
• First element from second list
• Second element from first list
• Second element from second list
• Third element from first list
• Third element from second list
• . . .
If the lists do not contain the same number of elements, the remaining elements from the longer list should be
placed consecutively at the end. For example, for a first list of [1, 2, 3, 4, 5] and a second list of [6, 7, 8,
9, 10, 11, 12], a call of alternate(list1, list2) should return a list containing [1, 6, 2, 7, 3, 8,
4, 9, 5, 10, 11, 12].
 */
public class ch11_2 {
    public static void main(String[] args) {

        LinkedList<Integer> list1 = new LinkedList<Integer>();
        LinkedList<Integer> list2 = new LinkedList<Integer>();

        list1.add(1);list1.add(2);list1.add(3);list1.add(4);list1.add(5);

        list2.add(7);list2.add(8);list2.add(9);list2.add(10);
        list2.add(11);list2.add(12);list2.add(13);list2.add(14);list2.add(15);

        System.out.println(alternateList(list1,list2));

    }

    public static LinkedList<Integer> alternateList (LinkedList<Integer> list1, LinkedList<Integer> list2){

        LinkedList<Integer> alternateList = new LinkedList<>();

        Iterator itr1 = list1.iterator();
        Iterator itr2 = list2.iterator();
        // Benytter to iteratorer til at iterere igennem de to lister for at flette dem sammen
        while (itr1.hasNext() || itr2.hasNext()) {
            if (itr1.hasNext()) {
                alternateList.add((Integer)itr1.next());
            }
            if (itr2.hasNext()) {
                alternateList.add((Integer)itr2.next());
            }
        }
        return alternateList;
    }
}


