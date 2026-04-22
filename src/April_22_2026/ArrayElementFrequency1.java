package April_22_2026;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class ArrayElementFrequency1
{
    public static void main(String[] args)
    {
        /**
         * Find the frequency of each element in the array
         */
        int[] array = {9, 23, 54, 9, 34, 54, 23, 94, 123, 5, 8, 9, 8};
        Map<Integer, Integer> map = new HashMap<>();
        for (int a: array)
        {
            map.put(a, map.getOrDefault(a, 0) +1);
        }
        System.out.println("Please input which element frequency do you want to know? ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        scanner.close();
        if (map.get(x) == null)
            System.out.println("No such element inside this array");
        else
            System.out.printf("(%d, %d)\n", x, map.get(x));
    }
}
