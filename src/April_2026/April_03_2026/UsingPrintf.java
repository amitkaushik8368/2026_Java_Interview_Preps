package April_2026.April_03_2026;

import java.util.Scanner;

/***
 *  Take the input from the user in n and print its table like below =>  n=2
 * 2 x 1 = 2
 * 2 x 2 = 4
 * 2 x 3 = 6
 * 2 x 4 = 8
 * 2 x 5 = 10
 * 2 x 6 = 12
 * 2 x 7 = 14
 * 2 x 8 = 16
 * 2 x 9 = 18
 * 2 x 10 = 20
 *
 *
 */

public class UsingPrintf
{
    public static void main(String[] args) {
        System.out.println("Enter the variable whose table you want to print: ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        for (int i = 1; i<=10; i++)
        {
            System.out.printf("%d x %d = %d\n", n, i, n*i);
        }




    }
}
