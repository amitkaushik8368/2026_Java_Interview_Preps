package April_2026.April_21_2026;

import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray2
{
    public static void main(String[] args) {
        int[] arr = {29, 3, 23, 54, 57, 8};
        //Arrays.stream(arr);

        int[] arr1 = IntStream.rangeClosed(1, 10).toArray();
        int[] arr2 = IntStream.range(1, 10).toArray();
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));

        int[] reverse = IntStream.rangeClosed(1, arr.length)
                .map(i -> arr[arr.length-i])
                .toArray();
        System.out.println(Arrays.toString(reverse));
    }
}
