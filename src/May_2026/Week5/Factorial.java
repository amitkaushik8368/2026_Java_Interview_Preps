package May_2026.Week5;

public class Factorial
{
    public static void main(String[] args) {
        int x = 7;
        int factorial = 1;
        for (int i=x;i>0;i--)
        {
            factorial = factorial*i;
        }
        System.out.println(factorial);
    }
}
