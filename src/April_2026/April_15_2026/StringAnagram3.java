package April_2026.April_15_2026;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram3
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter Second String: ");
        String s2 = scanner.nextLine();
        scanner.close();
        if (isAnagram(s1, s2))
            System.out.println("Strings are Anagram");
        else System.out.println("String are not Anagram");

    }


    public static boolean isAnagram(String str1, String str2)
    {
        char[] ch1 = str1.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
        char[] ch2 = str2.toLowerCase().replaceAll("[^A-Za-z0-9]", "").toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);
        return Arrays.equals(ch1, ch2);
    }
}
