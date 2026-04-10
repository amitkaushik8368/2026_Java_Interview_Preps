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


public class PyramidPattern
{

    public static void main(String[] args)
    {
        int n = 100;
        for (int i =0, j=n-1 ; i < n && j >=0 ; i++, j--)
        {
            System.out.print(" ".repeat(j));
            System.out.println("*".repeat(2*i + 1));
        }

    }
}
