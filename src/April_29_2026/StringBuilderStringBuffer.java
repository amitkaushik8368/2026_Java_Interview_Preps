package April_29_2026;

public class StringBuilderStringBuffer
{
    private final static int ITERATIONS = 10_000_000;
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Below data is for Single Thread Execution :");
        long start = System.currentTimeMillis();
        //System.out.println(start);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < ITERATIONS; i++) {
            sb.append("a");
        }
        long end = System.currentTimeMillis();
        System.out.println("StringBuilder time: " + (end-start));
        start = System.currentTimeMillis();
        StringBuffer sbf = new StringBuffer();
        for (int i = 0; i < ITERATIONS; i++) {
            sbf.append("a");
        }
        end = System.currentTimeMillis();
        System.out.println("StringBuffer time: " + (end-start));
        System.out.println("-------------------------------------------------------------");
        System.out.println("Below data is for Multiple Thread Execution :");

        StringBuffer sBuffer = new StringBuffer();
        Runnable task1 =
                () -> {
                    for (int i = 0; i < ITERATIONS; i++) {
                        sBuffer.append("a");
                    }
                };
        StringBuilder sBuilder = new StringBuilder();
        Runnable task2 =
                () -> {
                    for (int i = 0; i < ITERATIONS; i++) {
                        sBuilder.append("a");
                    }
                };
        Thread t1 = new Thread(task1);
        Thread t2 = new Thread(task1);

        start = System.currentTimeMillis();
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        end = System.currentTimeMillis();
        System.out.println("StringBuffer Time : " + (end-start));
        System.out.println("StringBuffer Length : " + sBuffer.length());

        Thread t3 = new Thread(task2);
        Thread t4 = new Thread(task2);
        start = System.currentTimeMillis();
        t3.start();
        t4.start();
        t3.join();
        t4.join();
        end = System.currentTimeMillis();
        System.out.println("-");
        System.out.println("StringBuilder Time : " + (end-start));
        System.out.println("StringBuilder Time : " + sBuilder.length());
    }
}
