package May_2026.Week5;


public class ArrayProgram
{

    public static void main(String[] args) {
        /*
        Factorial with recursion
         */
        int num = 5;
        System.out.println(factorial(num));
    }
    static int factorial(int x)
    {
        if (x==0)
            return 1;
        return x * factorial(x-1);
    }
}
