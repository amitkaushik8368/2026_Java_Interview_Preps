package July;

import java.util.Arrays;

public class StringProblem
{
    public static void main(String[] args)
    {
        String str = "I love pune,pune is great punepunepune";
        String str1 = "punepunepune";
        String input = "pune";
        String[] strArray = str.split(input, -1);
        int count = strArray.length-1;
        System.out.println(Arrays.toString(strArray));
        System.out.println(strArray.length);



    }
}
