package slidingwindow;

public class WordCount
{
    public static void main(String[] args) {
        String str = "I love pune,pune is great punepunepune";
        String search = "pune";
        int left = 0;
        int right = search.length();
        int count=0;
        for (; right <= str.length(); right++) {
            if(str.substring(left, right).equals(search))
            {
                count++;
            }
            left++;
        }
        System.out.println(count);
    }
}
