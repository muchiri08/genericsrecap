/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package generics;

import java.util.List;

public class Util {

    public static <K, V> boolean compare(Pair<K, V> pair1, Pair<K, V> pair2) {
        return pair1.getKey().equals(pair2.getKey()) && pair1.getValue().equals(pair2.getValue());
    }
    
    public static <T extends MyComparable<T>> int countGreaterThanElements(T[] arr, T elem) {
        int count = 0;
        for(T t: arr) {
            if(t.compareTo(elem) > 0) {
                ++count;
            }
        }
        
        return count;
    }
    
    public static void printList(List<?> list) {
        for(Object obj : list) {
            System.out.print(obj+" ");
        }
        System.out.println();
    }
}
