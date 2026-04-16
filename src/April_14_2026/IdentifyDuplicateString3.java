package April_14_2026;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *  String str = "This is doing what is doing well for well people"
 *
 */

public class IdentifyDuplicateString3
{
    public static void main(String[] args)
    {
        String str = "This is doing what is 123 doing 123 well for well people".toLowerCase();
        String[] strArray = str.split(" ");
        Map<String, Integer> map = new HashMap<>();
        for (String s : strArray)
        {
            map.put(s, map.getOrDefault(s, 0) +1);
        }
        System.out.print("Duplicate String : ");

        for (String s : map.keySet())
        {
            if(map.get(s) > 1)
                System.out.print(s + " ");
        }

        for (Map.Entry<String,Integer> entry : map.entrySet())
        {
            if (entry.getValue()> 1)
                System.out.print(entry.getKey() + " ");
        }
        System.out.println();
        System.out.println(map.entrySet().getClass());
        System.out.println(str.getClass());

        for (Integer x : map.values())
        {
            System.out.println(x);
        }

    }
}
