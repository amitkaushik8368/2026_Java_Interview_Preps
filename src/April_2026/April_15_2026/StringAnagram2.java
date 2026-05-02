package April_2026.April_15_2026;

import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter First String: ");
        String s1 = scanner.nextLine();
        System.out.println("Enter Second String: ");
        String s2 = scanner.nextLine();

        char[] ch1 = s1.toLowerCase().replaceAll("[^A-Za-z]", "").toCharArray();
        char[] ch2 = s2.toLowerCase().replaceAll("[^A-Za-z]", "").toCharArray();
        Arrays.sort(ch1);
        Arrays.sort(ch2);

        if (isAnagram(ch1, ch2))
            System.out.println("Strings are Anagram");
        else System.out.println("String are not Anagram");

    }


    public static boolean isAnagram(char[] str1, char[] str2)
    {
        if (str1.length != str2.length)
            return false;

        for (int i =0; i<str1.length; i++)
        {
            if (str1[i] != str2[i])
                return false;
        }
        return true;
    }

}
