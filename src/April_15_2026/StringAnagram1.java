package April_15_2026;
import java.util.Arrays;
import java.util.Scanner;

public class StringAnagram1
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
            System.out.println("These Strings are not anagram");  //rail safety, fairy tales
            return;
        }
        boolean[] alreadyCompared = new boolean[chars2.length];
        for (char c : chars1)
        {
            boolean thisCharFound = false;
            for (int j = 0; j < chars2.length; j++)
            {
                if (alreadyCompared[j])
                    continue;
                if (c == chars2[j]) {
                    thisCharFound = true;
                    alreadyCompared[j] = true;
                    break;
                }
            }
            if (!thisCharFound) {
                System.out.println("String is not anagram");
                return;
            }
        }
        System.out.println("These strings are anagram");
    }
}
