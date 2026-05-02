package April_2026.April_07_2026;

import java.util.Scanner;

/**
 *
 *Write a program that classifies a triangle based on its side lengths. Given three input values
 * representing the lengths of the sides, determine if the triangle is:
 *      equilateral (all sides are equal)
 *      isosceles (exactly two sides are equal)
 *      scalene (no sides are equal).
 * Use an if-else statement to classify the triangle.
 *
 */

public class CheckTheTriangle_1
{
    public static void main(String[] args)
    {
        System.out.println("Enter three sides of triangle:");

        Scanner scanner = new Scanner(System.in);
        int side1 = scanner.nextInt();
        int side2 = scanner.nextInt();
        int side3 = scanner.nextInt();

        String str = (side1 == side2 && side2 == side3)?"Equilateral Triangle" : (side1 == side2 || side2 == side3 || side1 == side3)? "Isosceles Triangle" : "Scalene Triangle";

        System.out.println(str);


    }
}
