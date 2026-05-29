package May_2026.Week5;

public class DigitsInNumber
{
    public static void main(String[] args) {
        int x = 153;
        int numOfDigits = String.valueOf(x).replaceAll("[^0-9]", "").length();
        int output = 0;
        while (x!=0)
        {
            int digit = x%10;
            for (int i=0; i<numOfDigits-1;i++)
            {
                digit = digit*digit;
            }
            output = output+digit;
            x =x/10;
        }
        System.out.println(output);

    }
}
