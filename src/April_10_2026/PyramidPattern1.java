package April_10_2026;

/**
 *
 *      *
 *     ***
 *    *****
 *   *******
 *  *********
 *
 */
public class PyramidPattern1
{
    public static void main(String[] args)
    {
        int x = 5;

        for (int i = 0 ; i < x ; i++)
        {
            for(int j = 0 ; j<x-i ; j++)
            {
                System.out.print(" ");
            }
            for (int k = 0; k< 2*i +1; k++)
                System.out.print("*");

            System.out.println();
        }



    }
}
