package slidingwindow;

public class WordCount1
{
    public static void main(String[] args) {
        String str = "I love pune,pune is great punepunepune";
        String searchWord = "pune";
        int left = 0;
        int count=0;
        for (int right = 0; right <= str.length(); right++)
        {
            if (str.substring(left,right).length() == 4)
            {
                if (str.substring(left,right).equals(searchWord))
                {
                    count++;
                }
                left++;
            }
        }
        System.out.println(count);
    }
}
