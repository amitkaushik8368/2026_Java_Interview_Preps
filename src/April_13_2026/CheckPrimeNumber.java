package April_13_2026;

import java.util.Scanner;

public class CheckPrimeNumber
{
    public static void main(String[] args) {

        System.out.println("Enter the number: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        boolean isPrime = true;
        for (int num = 2 ; num*num <= x ; num++)
        {
            if (x%num == 0)
            {
                isPrime = false;
                break;
            }
        }
        System.out.println(isPrime?"This is Prime Number" : "This is not a Prime number");
    }
}
