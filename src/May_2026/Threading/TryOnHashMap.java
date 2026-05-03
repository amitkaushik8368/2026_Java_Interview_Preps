package May_2026.Threading;

import java.util.HashMap;
import java.util.Map;

public class TryOnHashMap
{
    public static void main(String[] args) throws InterruptedException {
        Map<String, Integer> map = new HashMap<>();
        Runnable task = () ->{
            for (int i=0; i<1000 ; i++)
                map.put("test", map.getOrDefault("test", 0) + 1);
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
