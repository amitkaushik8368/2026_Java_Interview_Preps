package April_14_2026;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class IdentifyDuplicateString2
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toLowerCase();
        String[] strings = input.split("\\s+");
        Set<String> set = new HashSet<>();
        Set<String> duplicates = new HashSet<>();
        for (String str:strings)
        {
            if (!set.add(str))
            {
                duplicates.add(str);
            }
        }
        System.out.println(duplicates);

    }
}
