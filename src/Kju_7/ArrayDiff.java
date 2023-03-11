package Kju_7;

//Your goal in this kata is to implement a difference function, which subtracts one list from another and returns the result.
// It should remove all values from list a, which are present in list b keeping their order.
//
// Kata.arrayDiff(new int[] {1, 2}, new int[] {1}) => new int[] {2}
// If a value is present in b, all of its occurrences must be removed from the other:
//
// Kata.arrayDiff(new int[] {1, 2, 2, 2, 3}, new int[] {2}) => new  int[] {1, 3}

// Kata name - Array.diff

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> integers = Arrays.stream(a).boxed().toList();
        Iterator<Integer> it = integers.iterator();
        while(it.hasNext()) {
            Integer checked = it.next();
            for (int j : b) {
                if (checked == j) {
                    it.remove();
                    break;
                }
            }
        }
        int[] result = new int[integers.size()];
        for (int i = 0; i < integers.size(); i++) {
            result[i] = integers.get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5};
        int[] b = {1, 2};
        System.out.println(Arrays.toString(arrayDiff(a, b)));
    }

}
