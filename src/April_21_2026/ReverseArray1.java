package April_21_2026;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class ReverseArray1
{
    public static void main(String[] args)
    {
        int[] arr = {29, 3, 23, 54, 57, 8};
        List<Integer> list = new ArrayList<>(Arrays.stream(arr).boxed().toList());
        Collections.reverse(list);
        System.out.println(list);
        Set<Integer> set = Arrays.stream(arr).boxed().collect(Collectors.toSet());   // Explore this
//        Integer[] arrObject1 = Arrays.stream(arr).boxed().toArray(Integer[]::new);
//        List<Integer> list1 = Arrays.asList(arrObject1);
//        Collections.reverse(list1);
//        System.out.println(list1);



    }
}
