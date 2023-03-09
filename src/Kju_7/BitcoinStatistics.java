package Kju_7;
//Your friend Phil came up with a great new Bitcoin investment strategy, but before he can start making millions,
// he needs to know the minimum, average and maximum exchange rate for certain periods in the last few months.
//
//He'll pay you 0.5 Bitcoin for a function that takes several arrays (one for each period) and calculates the minimum,
// average and maximum for each array, as well as the total minimum, average and maximum.
// Some numbers at the start and end of each period don't agree with Phil's theory, so he wants you to discard them.
//
//For example, for the input
//discard = 2
//array 0 = 800,1200,2100,4100,1300,700 // discard 800,1200 at start and 1300,700 at end
//array 1 = 1000,1500,4500,5000,5800,2000,1500 // discard 1000,1500 at start and 2000,1500 at end
//your function should return
//
//array 0 = 2100,3100,4100 // min, avg, max for input array 0 (without discarded values)
//array 1 = 4500,5100,5800 // min, avg, max for input array 1 (without discarded values)
//array 2 = 2100,4300,5800 // total min, avg, max (without discarded values)

import java.util.Arrays;

public class BitcoinStatistics {
    public static double[][] getMinAvgMax(int discard, double[][] data) {
        double[][] result = new double[data.length][];
        for (int i=0; i< data.length;i++) {
            double[] array = Arrays.copyOfRange(data[i], discard, data[i].length - discard);
            Arrays.sort(array);
            double sum = Arrays.stream(array).sum();
            result[i] = new double[]{array[0], sum / array.length, array[array.length - 1]};
        }
        double min = Arrays.stream(result)
                .mapToDouble(d ->d[0])
                .min()
                .getAsDouble();
        double ave = Arrays.stream(result)
                .mapToDouble(d ->d[1])
                .sum()/ result.length;
        double max = Arrays.stream(result)
                .mapToDouble(d ->d[2])
                .max()
                .getAsDouble();
        double[][] finalresult = Arrays.copyOf(result, result.length+1);
        finalresult[result.length] = new double[] {min, ave, max};
        return finalresult;
    }

    public static void main(String[] args) {
        double[][] data = {{0.0,1.0,2.0,3.0,4.0,5.0}, {0.0,1.2,2.0,3.0,4.0}, {0.0,1.4,2.0,3.0}};
        System.out.println(Arrays.deepToString(getMinAvgMax(1,data)));
    }
}

