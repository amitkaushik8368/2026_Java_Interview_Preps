package April_30_2026_2026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class StringBuilderStringBuffer1
{
    private final static int ITERATIONS = 10_000_000;
    public static void main(String[] args) throws InterruptedException {

        //long start = System.currentTimeMillis();
        //long end = System.currentTimeMillis();
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

        ExecutorService executorService = Executors.newFixedThreadPool(2);
        executorService.submit(task1);
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task2);
        executorService.shutdown();
        executorService.awaitTermination(1, TimeUnit.MINUTES);
        executorService.close();
        System.out.println(sBuffer.length());
        System.out.println(sBuilder.length());
    }
}
