package April_2026.April_04_2026;

import java.util.Scanner;

public class AdvancePalindromeString_1
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string below to be checked: ");
        String str = scanner.nextLine();
        String lowerCaseStr = str.toLowerCase().replaceAll("[^a-z]", "");
        StringBuilder stringBuilder = new StringBuilder(lowerCaseStr);
        String reverseString = String.valueOf(stringBuilder.reverse());
        if (lowerCaseStr.equals(reverseString))
            System.out.println("String is palindrome");
        else
            System.out.println("String is not palindrome");

    }
}
