package April_17_2026;


public class StringAnagram4
{
    public static void main(String[] args)
    {
        /**
         * This approach cannot handle non alphabets
         */
        int[] alphabetsCount = new int[26];
        String s1 = "silent".toLowerCase();
        String s2 = "listen".toLowerCase();

        if (s1.length() != s2.length()) {
            System.out.println("String is not Anagram");
            return;
        }

        for (int i = 0 ; i< s1.length(); i++)
        {

            alphabetsCount[s1.charAt(i) - 'a']++;
            alphabetsCount[s2.charAt(i) - 'a']--;

        }
        for (int x : alphabetsCount)
        {
            if (x !=0) {
                System.out.println("String is not Anagram");
                return;
            }
        }
        System.out.println("String is Anagram");
    }
}
