package April_13_2026;

import java.util.Arrays;

public class StringReverse1
{
    public static void main(String[] args)
    {
        String str = "Amit Sharma";
        char[] chars = str.toCharArray();
        int x = 0, y = chars.length-1;
        for(; x<y; x++, y--)
        {
            char temp;
            temp = chars[x];
            chars[x] = chars[y];
            chars[y] = temp;
        }
//
//        while (x<y)
//        {
//            char temp;
//            temp = chars[x];
//            chars[x++] = chars[y];
//            chars[y--] = temp;
//        }


        //System.out.println(chars.toString());
        System.out.println(Arrays.toString(chars));
        //String str1 = String.valueOf(chars);
        String str1 = new String(chars);
        System.out.println(str1);
    }
}
