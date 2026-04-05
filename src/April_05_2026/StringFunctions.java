package April_05_2026;

import java.util.stream.IntStream;

public class StringFunctions
{
    public static void main(String[] args) {

        String string = "Pratima Kaushik";
        String string1 = "pratima kaushik";
        IntStream ch1 = string1.chars();

        if (string1.contains("ima au"))
            System.out.println("this is excellent method");

       // char[] ch = string1.toCharArray();
       // System.out.println(ch[2]);
//        if (string1.equalsIgnoreCase(string))
//        {
//            System.out.println("This is true");
//        }





     //   System.out.println(ch1.max());

    }
}
