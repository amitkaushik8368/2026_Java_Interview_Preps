package April_2026.April_29_2026;

import java.util.concurrent.atomic.AtomicInteger;

class Counter1{
    AtomicInteger count = new AtomicInteger();
    void increment()
    {
        count.incrementAndGet();
    }
}
public class ThreadSynchronization2
{
    public static void main(String[] args) throws InterruptedException {
        Counter1 counter = new Counter1();
        Thread t1 = new Thread(
                () -> {
                        for (int i = 0; i < 10_000; i++)
                            counter.increment();
                    });
        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 10_000; i++)
                        counter.increment();
                }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(counter.count);
    }
}
