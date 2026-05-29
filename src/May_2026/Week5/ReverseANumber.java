package May_2026.Week5;

public class ReverseANumber
{
    public static void main(String[] args) {
        int input = 12345;
        // output = 54321
        StringBuilder stringBuilder = new StringBuilder();
        while (input!=0)
        {
            int num = input%10;
            input = input/10;
            stringBuilder.append(num);
        }
        String num1 = stringBuilder.toString();
        int a = Integer.parseInt(num1);
        System.out.println(a);
    }
}
