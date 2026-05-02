package April_2026.April_05_2026;

import java.util.Scanner;

public class StringEndsWith
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the line below");
        String str = scanner.nextLine();

        System.out.println("Enter the word you want to check if the line ends with: ");
        String word = scanner.nextLine();


        if (str.endsWith(word))
        {
            System.out.println("Yes the string ends with this");
        } else System.out.println("No the string does not end with this");

    }
}
