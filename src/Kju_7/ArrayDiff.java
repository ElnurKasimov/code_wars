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

public class ArrayDiff {
    public static int[] arrayDiff(int[] a, int[] b) {
        int newLength = 0;
        int[] newArray = new int[a.length];
        for (int i = 0; i < a.length ; i++) {
            boolean contains = false;
            for (int j = 0; j < b.length; j++) {
                if(a[i] == b[j]) {
                    contains = true;
                    break;
                }
            }
            if (!contains) {
                newArray[newLength] = a[i];
                newLength++;
            }
        }
        return Arrays.copyOf(newArray, newLength);
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 0, 5, 4};
        int[] b = {5, 2};
        System.out.println("a : " + Arrays.toString(a));
        System.out.println("b : " + Arrays.toString(b));
        System.out.println("Diff :" + Arrays.toString(arrayDiff(a, b)));
    }

}

// THE BEST SOLUTION
//public static int[] arrayDiff(int[] a, int[] b) {
//    List<Integer> listA = Arrays.stream(a).boxed().collect(Collectors.toList());
//    List<Integer> listB = Arrays.stream(b).boxed().collect(Collectors.toList());
//    listA.removeAll(listB);
//    return listA.stream().mapToInt(e -> e).toArray();
//}
