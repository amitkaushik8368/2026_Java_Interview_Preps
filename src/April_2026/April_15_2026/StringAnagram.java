package April_2026.April_15_2026;
import java.util.Arrays;
import java.util.Scanner;
public class StringAnagram
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first String: ");
        String input1 = scanner.nextLine();
        System.out.println("Enter second String: ");
        String input2 = scanner.nextLine();
        scanner.close();
        char[] chars1 = input1.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        char[] chars2 = input2.replaceAll("[^a-zA-Z]", "").toLowerCase().toCharArray();
        if (chars1.length != chars2.length)
        {
            System.out.println("These Strings are not anagram");
            return;
        }
        Arrays.sort(chars1);
        Arrays.sort(chars2);
        for (int i = 0; i<chars1.length; i++)
        {
            if (chars1[i]!=chars2[i])
            {
                System.out.println("These String are not anagram");
                return;
            }
        }
        System.out.println("These Strings are anagram");
    }
}
