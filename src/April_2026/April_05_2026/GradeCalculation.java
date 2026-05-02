package April_2026.April_05_2026;

import java.util.Scanner;

/***
 * Print grade for marks
 * A: 90-100
 * B: 80-89
 * C: 70-79
 * D: 60-69
 * F: 0-59
 *
 */

public class GradeCalculation
{
    public static void main(String[] args)
    {

        System.out.println("Enter your marks you've obtained and I will tell you your grades");
        Scanner scanner = new Scanner(System.in);
        int marks = scanner.nextInt();

        if (marks>=90 && marks<=100)
            System.out.println("Your grade is: A");
        else if (marks>=80 && marks < 90)
            System.out.println("Your grade is: B");
        else if (marks>=70 && marks < 80)
            System.out.println("Your grade is: C");
        else if (marks>=60 && marks < 70)
            System.out.println("Your grade is: D");
        else if (marks>=0 && marks < 60)
            System.out.println("Your grade is: F");
        else System.out.println("Invalid entry");

    }
}
