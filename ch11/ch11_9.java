package ch11;
/*
Write a method hasEven that accepts a set of integers as a parameter and returns true if the set contains at least
one even integer and false otherwise. If passed the empty set, your method should return false
 */
import java.util.*;

public class ch11_9 {
    public static void main(String[] args) {

        Set<Integer> list = new TreeSet<>();

        list.add(1);
        list.add(5);
        list.add(3);
        System.out.println(hasEven(list));

    }

    public static boolean hasEven(Set<Integer> ints){

       for (Integer i : ints){
           if (i%2 == 0){
               return true;
           }
       }
       return false;
    }
}
