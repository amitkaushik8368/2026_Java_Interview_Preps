package April_05_2026;

import java.util.Scanner;

/**
 *
 * This code is to check where a particular word is present in the input line
 *
 */


public class CheckWordInString
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line below");
        String str = scanner.nextLine();

        System.out.println("Enter the word you want to find in the line: ");
        String word = scanner.nextLine();

        if (str.contains(word))
        {
            System.out.println(word + " -> is present in the string you entered");
        }

    }
}
