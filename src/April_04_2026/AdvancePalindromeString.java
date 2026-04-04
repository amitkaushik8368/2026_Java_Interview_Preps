package April_04_2026;

import java.util.Scanner;

public class AdvancePalindromeString
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string below to be checked: ");
        String str = scanner.nextLine();
        String lowerCaseStr = str.toLowerCase();
        StringBuilder stringBuilder = new StringBuilder(lowerCaseStr);
        String reverseString = String.valueOf(stringBuilder.reverse());
        if (lowerCaseStr.equals(reverseString))
            System.out.println("This string is Palindrome");
        else System.out.println("This string is not palindrome");




    }
}
