package May_2026.Week1;

import java.util.Arrays;

public class BubbleSort
{
    public static void main(String[] args) {
        //int[] arr = {7, 2, -9, 1, -5, 3, 0, -100};
        int[] arr = {1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            boolean isSwapped = false;
            for (int j = 0; j < arr.length-1-i; j++) {
                if (arr[j] > arr[j+1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    isSwapped = true;
                }
            }
            if (!isSwapped)
                break;
        }
        System.out.println(Arrays.toString(arr));
    }
}
