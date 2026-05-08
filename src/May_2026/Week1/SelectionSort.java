package May_2026.Week1;
import java.util.Arrays;

public class SelectionSort
{
    public static void main(String[] args)
    {
        int[] arr = {7, 2, -9, 1, -5, 3, 0};
        for (int i = 0; i<arr.length; i++)
        {
            int minValue = arr[i];
            int minIndex = i;
            for (int j=i+1 ; j<arr.length; j++)
            {
                if (arr[j] < minValue)
                {
                    minValue = arr[j];
                    minIndex = j;
                }
            }
            if (i!=minIndex) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
