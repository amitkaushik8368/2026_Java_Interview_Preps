package April_2026.April_04_2026;

import java.util.Scanner;

public class SimplePalindromeString
{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the string below to be checked: ");
        String str = scanner.nextLine();
        String lowerCaseStr = str.toLowerCase();
        //System.out.println(lowerCaseStr);

        //int i =0, j=str.length();
        for (int i=0, j=lowerCaseStr.length()-1; i<j; i++, j--)
        {
            if (lowerCaseStr.charAt(i) != lowerCaseStr.charAt(j))
            {
                System.out.println("This string is not palindrome");
                System.exit(0);
            }
        }
        System.out.println("This string is palindrome");



    }
}
