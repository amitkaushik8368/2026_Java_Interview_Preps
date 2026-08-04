package July;

import java.util.Arrays;

public class StringProblem
{
    public static void main(String[] args)
    {
        String str = "I love pune,pune is great punepunepune";
        String input = "pune";
//        String[] strArray = str.split(input, -1);
//        System.out.println(strArray.length-1);
        int index = 0;
        int count = 0;
        while ((index=str.indexOf(input, index)) != -1)
        {
            index = index+input.length();
            count++;
        }
        System.out.println("Count of 'pune' : " + count);

    }
}
