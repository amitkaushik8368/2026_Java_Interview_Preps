package April_2026.April_05_2026;

import java.util.Scanner;

/**
 * program to check for a year being a leap year
 */

public class LeapYearChecker
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int x = scanner.nextInt();
        if(x%4==0)
        {
            if (x%100 == 0)
            {
                if (x%400 == 0)
                    System.out.println("This year is leap year");
                else
                    System.out.println("The number is not leap year");
            } else System.out.println("This is a leap year");
        } else System.out.println("The number is not leap year");
    }
}
