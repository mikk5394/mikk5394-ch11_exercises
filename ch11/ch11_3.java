package ch11;
/*
Write a method called removeEvenInRange that accepts three parameters: a LinkedList, a starting index, and an
ending index. The method’s behavior is to remove all occurrences of the even numbers that appear in the list
between the starting index (inclusive) and the ending index (exclusive). Other values and occurrences of the even
numbers that appear outside the given index range are not affected.
For example, for the list [1, 1, 2, 0, 4, 5, 6, 8, 8, 3, 11, 9, 12, 0, 14, 0, 16], a call of
removeEvenInRange(list, 5, 13) should produce the list [1, 1, 2, 0, 4, 5, 3, 11, 9, 0, 14, 0, 16].
Notice that the even numbers located at indexes between 5 inclusive and 13 exclusive in the original list (before any
modifications were made) have been removed.
 */

import java.util.*;

public class ch11_3 {
    public static void main(String[] args) {

        LinkedList<Integer> liste = new LinkedList<Integer>();

        for (int i = 0; i <= 20; i++){
            liste.add(i);
        }

        System.out.println(removeEvenInRange(liste,5,13));
    }

    public static LinkedList<Integer> removeEvenInRange(LinkedList<Integer> liste, int startIndex, int endingIndex){

        LinkedList<Integer> removeEven = new LinkedList<Integer>();

        removeEven.addAll(liste);

        while (endingIndex > startIndex){
            // benytter modulus til at fjerne hele tal fra det givne index og frem til det givne slut index
            if (removeEven.get(startIndex) % 2 == 0){
                removeEven.remove(startIndex);
                startIndex++;
            } else {
                startIndex++;
            }
        }
        return removeEven;
    }
}
