package April_29_2026;

class Counter{
    int count = 0;
    void increment()
    {
        synchronized (this) {
            count++;
        }
    }
}
public class ThreadSynchronization1
{
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();
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
