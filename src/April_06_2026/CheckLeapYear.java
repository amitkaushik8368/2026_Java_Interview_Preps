package April_06_2026;

import java.util.Scanner;

public class CheckLeapYear
{
    public static void main(String[] args) {

        /**
         * Check leap year here through easy way
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the year you want to check: ");
        int x = scanner.nextInt();
        boolean isLeapYear = (x % 4 == 0 && x % 100 != 0) || x % 400 == 0;

        if (isLeapYear)
            System.out.println("This year is leap");
        else
            System.out.println("This is not leap year");
    }
}
