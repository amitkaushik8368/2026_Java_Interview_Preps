package May_2026.Week5;

public class ReverseANumber1
{
    public static void main(String[] args) {
        int input = -12345;
        // output = 54321
        int output = 0;
        while (input!=0)
        {
            output = output*10;
            int modulus = input%10;
            output = output+modulus;
            input = input/10;
        }
        System.out.println(output);
    }
}
