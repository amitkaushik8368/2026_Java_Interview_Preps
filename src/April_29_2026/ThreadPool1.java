package April_29_2026;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class Counter3{
    int count = 0;
    void increment()
    {
        count++;
    }
}

public class ThreadPool1
{
    public static void main(String[] args) {
        Counter3 counter3 = new Counter3();
        try(ExecutorService service = Executors.newFixedThreadPool(3)){
            for (int i = 0; i < 3; i++) {
                service.submit(()
                -> {
                            for (int j = 0; j < 10_000; j++) {
                                counter3.increment();
                            }
                        }
                        );
            }
        }
        System.out.println(counter3.count);

    }
}
