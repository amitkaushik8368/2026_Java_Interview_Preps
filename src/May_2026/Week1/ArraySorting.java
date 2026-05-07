package May_2026.Week1;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraySorting
{
    public static void main(String[] args)
    {
        int[] arr = {7, 2, -9, 1, -5, 3, 0};
        for (int i = 0; i<arr.length; i++)
        {
            for (int j=i+1 ; j<arr.length; j++)
            {
                if (arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
