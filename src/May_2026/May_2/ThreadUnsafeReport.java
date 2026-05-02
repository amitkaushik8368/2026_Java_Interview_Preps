package May_2026.May_2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class FakeReport{
    static Map<String, List<String>> report = new ConcurrentHashMap<>() {
    };

    static void createTest(String test)
    {
        report.put(test, Collections.synchronizedList(new ArrayList<>()));
    }

    static void logMessage(String test, String message)
    {
        report.get(test).add(message);
    }
    static void printReport()
    {
        for (String test: report.keySet())
        {
            System.out.println("======>" + test + "========");
            for (String log: report.get(test))
            {
                System.out.println(log);
            }
        }
    }
}

public class ThreadUnsafeReport
{
    public static void main(String[] args)
    {
        ExecutorService executorService = Executors.newFixedThreadPool(3);
        Runnable task1 = () -> runTest("Test-A");
        Runnable task2 = () -> runTest("Test-B");
        Runnable task3 = () -> runTest("Test-C");
        executorService.submit(task1);
        executorService.submit(task2);
        executorService.submit(task3);

        executorService.shutdown();
        while (!executorService.isTerminated()){}
        executorService.close();
        FakeReport.printReport();
    }

    static void runTest(String test)
    {
        FakeReport.createTest(test);
        for (int i = 0; i < 5; i++) {
            FakeReport.logMessage(test, Thread.currentThread().getName() + " -> Step " + i);
        }
    }

}
