package May_2026.Week1;
import java.util.Arrays;

public class ArraySorting1
{
    public static void main(String[] args)
    {
        int[] arr = {7, 2, -9, 1, -5, 3, 0};
        for (int i = 0; i<arr.length; i++)
        {
           // [-9, -5, 0, 1, 2, 3, 7]  i = 3
            int smallest = arr[i];
            int index = 0;
            for (int j=i ; j<arr.length; j++)
            {
                if (arr[j] < smallest)
                {
                    smallest = arr[j];
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
            System.out.println(Arrays.toString(arr));
        }

    }
}
