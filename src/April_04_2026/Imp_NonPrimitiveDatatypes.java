package April_04_2026;

import java.util.Arrays;
import java.util.Scanner;

/***
 * <p>
 * Here let's mainly talk about String and Arrays
 *
 */


public class Imp_NonPrimitiveDatatypes {
    public static void main(String[] args) {

        String str = "My name is Amit Sharma";
        String str1 = new String("My name is Pratima Kaushik");

        System.out.println(str1);
        System.out.println(str);

        int[] x = {1,2,3,4,5};
        System.out.println(Arrays.toString(x));

        Scanner scanner = new Scanner(System.in);

        int[] y = new int[3];
        System.out.println("Enter all three integers below:");
        for (int i = 0; i<y.length; i++)
        {
            y[i] = scanner.nextInt();
        }

        System.out.println("Integers you entered: " + Arrays.toString(y));


    }
}
