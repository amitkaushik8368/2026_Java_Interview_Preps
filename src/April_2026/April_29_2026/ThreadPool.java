package April_2026.April_29_2026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter2{
    int count = 0;
    synchronized void increment()
    {
        count++;
    }
}

public class ThreadPool
{
    public static void main(String[] args) {
        Counter2 counter2 = new Counter2();
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            service.submit(
                    () -> {
                        for (int i = 0; i < 10_000; i++) {
                            counter2.increment();
                        }
                    }
            );
            service.submit(() ->
            {
                for (int i = 0; i < 10_000; i++) {
                    counter2.increment();
                }
            });
            service.submit(() ->
            {
                for (int i = 0; i < 10_000; i++) {
                    counter2.increment();
                }
            });
        }
        System.out.println(counter2.count);

    }
}
