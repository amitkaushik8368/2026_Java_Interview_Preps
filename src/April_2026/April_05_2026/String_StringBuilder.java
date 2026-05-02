package April_2026.April_05_2026;

public class String_StringBuilder
{
    public static void main(String[] args) {
        String str = "Pratima Kaushik";
        String lowerString = str.toLowerCase();

        StringBuilder stringBuilder = new StringBuilder(lowerString);
        stringBuilder.reverse();


        str = str.concat("Amit");


        System.out.println(stringBuilder);
        System.out.println(str);





        //System.out.println(stringBuilder);



    }
}
