package April_13_2026;

public class StringReverse
{
    public static void main(String[] args)
    {
        String str = "Amit Sharma";
        StringBuilder stringBuilder = new StringBuilder(str);
        stringBuilder.reverse();
        System.out.println(stringBuilder);

    }
}
