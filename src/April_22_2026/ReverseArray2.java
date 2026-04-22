package April_22_2026;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;

public class ReverseArray2
{
    public static void main(String[] args) {

        int[] arr = {29, 3, 23, 54, 57, 8};
        int[] reverseArray = IntStream.range(0, arr.length).map(i-> arr[arr.length-1-i]).toArray();
        System.out.println(Arrays.toString(reverseArray));

    }
}
