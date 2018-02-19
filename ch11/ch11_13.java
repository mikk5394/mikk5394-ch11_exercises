package ch11;
import java.util.*;
/*
Write a method isUnique that accepts a map whose keys and values are strings as a parameter and returns true if
no two keys map to the same value (and false if any two or more keys do map to the same value). For example, if
the map contains the following key/value pairs, your method would return true: {Marty=Stepp, Stuart=Reges,
Jessica=Miller, Amanda=Camp, Hal=Perkins}. But calling it on the following map would return false,
because of two mappings for Perkins and Reges: {Kendrick=Perkins, Stuart=Reges, Jessica=Miller,
Bruce=Reges, Hal=Perkins}.
 */
public class ch11_13 {

    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();

        map.put("Kendrick", "Perkins");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Bruce", "Reges");
        map.put("Hal", "Perkins");

        System.out.println("Returner true hvis mappet ikke indeholder 2 eller flere nøgler til samme value, false otherwise: \n" + isUnique(map));
        Map<String, String> map2 = new HashMap<>();

        map.put("Kendrick", "Perkins");
        map.put("Stuart", "Reges");
        map.put("Jessica", "Miller");
        map.put("Bruce", "Stepp");
        map.put("Hal", "Camp");
        System.out.println();
        System.out.println("Returner true hvis mappet ikke indeholder 2 eller flere nøgler til samme value, false otherwise: \n" + isUnique(map2));

    }

    public static boolean isUnique (Map<String, String> map){

        // Første tanke var at få lagt alle map values ind i et set for så at sammenligne
        // size på de to (da 1 pair/entry bliver talt som 1 i map.size). Hvis størrelsen på settet så ikke
        // matcher størrelsen på mappet ved man at mappet indeholder flere nøgler til samme values
        // (da set fjerner alle duplicates).

        // Laver her et set til at indeholde alle values fra det givne map.
        Set<String> tempSet = new TreeSet<>();

        // Prøvede i et stykke tid at få et forEach loop til at virke på et map, men blev nødt til at
        // finde et eksempel på google til sidst. Var i tvivl om hvordan typen skulle skrives.
        for (Map.Entry<String, String> entry : map.entrySet()){
            tempSet.add(entry.getValue());
        }
        if (tempSet.size() == map.size()){
            return true;
        }
        return false;
    }
}
