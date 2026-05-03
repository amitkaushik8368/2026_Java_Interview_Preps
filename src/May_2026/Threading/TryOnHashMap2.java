package May_2026.Threading;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TryOnHashMap2
{
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new ConcurrentHashMap<>();
        Runnable task = () ->{
            for (int i=0; i<1000 ; i++)
                    map.merge("test", 1,Integer::sum);
        };
        Thread t1 = new Thread(task);
        Thread t2 = new Thread(task);
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(map.get("test"));
    }
}
