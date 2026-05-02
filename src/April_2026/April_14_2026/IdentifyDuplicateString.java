package April_2026.April_14_2026;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class IdentifyDuplicateString
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
       // String lowerInput = input.toLowerCase();
        String[] strings = input.split("\\s+");
        List<String> duplicateStrings = new ArrayList<>();
        List<Integer> duplicatesAt = new ArrayList<>();


        for (int i = 0; i<strings.length-1; i++)
        {
            boolean duplicateFound= false;
            if (duplicatesAt.contains(i))
            {
                continue;
            }
            for(int j = i+1 ; j<strings.length; j++)
            {
                if (strings[i].equalsIgnoreCase(strings[j]))
                {
                    duplicatesAt.add(j);
                    duplicateFound = true;
                }
            }
            if (duplicateFound)
                duplicateStrings.add(strings[i]);
        }
        System.out.println("Duplicate Strings: " + duplicateStrings);


    }
}
