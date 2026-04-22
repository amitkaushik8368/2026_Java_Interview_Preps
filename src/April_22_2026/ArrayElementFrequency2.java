package April_22_2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementFrequency2
{
    public static void main(String[] args)
    {
        /**
         * Find the frequency of each element in the array
         */
        int[] array = {9, 23, 54, 9, 34, 54, 23, 94, 123, 5, 8, 9, 8};

        /**
         * Map<Integer, Long> freq =
         *     Arrays.stream(array)
         *           .boxed()
         *           .collect(Collectors.groupingBy(
         *               Function.identity(),
         *               Collectors.counting()
         *           ));
         *
         * System.out.println(freq);
         *
         * -----------------------------------------------
         * Arrays.sort(array);
         * int count = 1;
         * for (int i = 1; i < array.length; i++) {
         *     if (array[i] == array[i - 1]) {
         *         count++;
         *     } else {
         *         System.out.println("(" + array[i - 1] + ", " + count + ")");
         *         count = 1;
         *     }
         * }
         * System.out.println("(" + array[array.length - 1] + ", " + count + ")");
         *
         * --------------------------------------------
         * Map<Integer, Integer> map = new TreeMap<>();
         * for (int num : array) {
         *     map.put(num, map.getOrDefault(num, 0) + 1);
         * }
         * System.out.println(map);
         *
         *
         *
         */
    }
}
