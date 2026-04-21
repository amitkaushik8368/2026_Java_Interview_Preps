package April_21_2026;

import java.util.Arrays;

public class ReverseArray
{
    public static void main(String[] args)
    {
        int[] integerArray = {22, 3, 29, 56, 35, 54};
        int temp;
        for (int i = 0 , j= integerArray.length-1; i < j ; i++, j--)
        {
            temp = integerArray[i];
            integerArray[i] = integerArray[j];
            integerArray[j] = temp;
        }
        System.out.println(Arrays.toString(integerArray));

    }
}
