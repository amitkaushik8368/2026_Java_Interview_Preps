package April_07_2026;

public class ExploreStringBuilder
{
    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder("Amit");
        stringBuilder.reverse();

        stringBuilder.append(true);

        String s = stringBuilder.toString();

        System.out.println(stringBuilder);



    }
}
