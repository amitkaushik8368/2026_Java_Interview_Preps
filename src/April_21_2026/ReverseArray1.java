package April_21_2026;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;


public class ReverseArray1
{
    public static void main(String[] args)
    {
        int[] arr = {29, 3, 23, 54, 57, 8};
        Integer[] arrObject = Arrays.stream(arr).boxed().toArray(Integer[]::new);
        System.out.println(arrObject);


    }
}
