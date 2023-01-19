package Kju_7;

import java.util.Arrays;

public class SortArrayForOddValueOnly {
    public static void main(String[] args) {
        int[] input = {3,6,8,35,27, 85, 344, -18,35, 77,  0, 77, 476};
        System.out.println("input = " + Arrays.toString(input));
        int[] sortedOdd = Arrays.stream(input)
                .filter(it  ->  (  it % 2  != 0) )
                .sorted()
                .toArray();
        for (int i = 0, j =0; i < input.length ; i++) {
            if(input[i] % 2 != 0) input[i] = sortedOdd[j++];
        }
        System.out.println("input = " + Arrays.toString(input));
    }
}
