package ArrayTechniques;

import java.util.Map;

public class LargestSmallestElement
{
    public static void main(String[] args) {
        int[] arr = {
                0,
                -1,
                999999999,
                -999999999,
                Integer.MAX_VALUE,
                Integer.MIN_VALUE,
                42,
                -42,
                42,
                -100000,
                100000,
                7,
                -7,
                1,
                -1,
                Integer.MAX_VALUE - 1,
                Integer.MIN_VALUE + 1
        };
        System.out.println("Largest: " + largest(arr));
        System.out.println("Smallest: " + smallest(arr));

    }
    static int largest(int[] arr)
    {
        int largestElement = Integer.MIN_VALUE;
        for (int element: arr)
            largestElement = Math.max(element, largestElement);
        return largestElement;
    }
    static int smallest(int[] arr)
    {
        int smallestElement = Integer.MAX_VALUE;
        for (int element: arr)
            smallestElement = Math.min(element, smallestElement);
        return smallestElement;
    }
}
