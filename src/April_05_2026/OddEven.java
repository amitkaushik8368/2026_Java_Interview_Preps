package April_05_2026;

import java.util.Scanner;

public class OddEven
{
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();

        //String str = x%2==0? "The number is even" : "The number is odd";
        //System.out.println(str);

        String str = x%4 ==0 ? x%100 == 0 ? x%400 == 0? "The number is leap year": "The number is not leap year" : "This is leap year": "This is not leap year";
        System.out.println(str);


    }
}
