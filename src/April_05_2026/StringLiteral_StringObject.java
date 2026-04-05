package April_05_2026;

public class StringLiteral_StringObject
{
    public static void main(String[] args) {

        String str = "Amit";
        String str1 = "Amit";

        String string = new String("Amit Sharma");
        String string1 = new String("Amit Sharma");
        if (str1 == str)
        {
            System.out.println("Iam correct");
        }
        if (str.equals(str1))
            System.out.println("THe code will come here too");
        if (string1 == string)
        {
            System.out.println("This code shouldn't reach here");
        } else if (string1.equals(string))
        {
            System.out.println("THe code should reach here");
        }



    }
}
