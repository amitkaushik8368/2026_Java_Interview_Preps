package April_10_2026;

import java.util.Scanner;

public class CountVowelConsonant
{
    public static void main(String[] args) {
        System.out.println("Enter the String: ");
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();

        String vowels = str.replaceAll("[^aeiouAEIOU]", "");
        String consonants = str.replaceAll("[aeiouAEIOU\\s+]", "") ;
        String spaces = str.replaceAll("[^\\s+]", "");
        System.out.println("The vowels present in the string are : " + vowels + " and count is : " + vowels.length());

        System.out.println("The consonants present in the string are : " + consonants + " and count is : " + consonants.length());

        System.out.println("Count of spaces: " + spaces.length());

    }
}
