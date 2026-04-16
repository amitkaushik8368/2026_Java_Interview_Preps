package April_14_2026;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
public class IdentifyDuplicateString1
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        String[] strings = input.split("\\s+");
        String[] duplicates = new String[strings.length];
        boolean[] visited = new boolean[strings.length];
        int index = 0;
        for (int i=0; i<strings.length; i++)
        {
            boolean duplicateFound = false;
            if (visited[i])
                continue;
            for (int j = i+1; j<strings.length; j++)
            {
                if (strings[i].equalsIgnoreCase(strings[j]))
                {
                    visited[j] = true;
                    duplicateFound = true;
                }
            }
            if (duplicateFound)
                duplicates[index++] = strings[i];
        }
        String[] duplicates1 = Arrays.copyOf(duplicates, index);
        for (String duplicate : duplicates1) {
            System.out.print(duplicate + " ");
        }
    }
}
