package April_29_2026;

public class StringBuilderStringBuffer
{
    private final static int ITERATIONS = 10_000_000;
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        //System.out.println(start);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder time with single thread: " + (end-start));
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time with single thread: " + (end-start));
    }
}
