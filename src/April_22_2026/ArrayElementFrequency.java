package April_22_2026;

public class ArrayElementFrequency
{
    public static void main(String[] args)
    {
        /**
         * Find the frequency of each element in the array
         */
        int[] array = {9, 23, 54, 9, 34, 54, 23, 94, 123, 5, 8, 9, 8};
        boolean[] alreadyChecked = new boolean[array.length];
        System.out.println("Frequency of Element is below in format (<Element>, <Frequency>)");
        for (int i = 0 ; i<array.length;i++)
        {
            if (alreadyChecked[i])
                continue;
            int count = 1;
            for (int j = i+1; j<array.length; j++)
            {
                if (array[i] == array[j])
                {
                    count++;
                    alreadyChecked[j] = true;
                }
            }
            //System.out.println("(" + array[i] + ", " + count + ")");
            System.out.printf("(%d, %d)\n", array[i], count);
        }

    }
}
