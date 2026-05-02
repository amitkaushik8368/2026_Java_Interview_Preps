package April_2026.April_29_2026;

class WriteLogs{
    int count = 0;
    void log(String msg)
    {
        //System.out.println(msg);
        count++;
    }
}
public class ThreadSynchronization3
{
    public static void main(String[] args) throws InterruptedException {
        WriteLogs logs = new WriteLogs();
        Thread t1 = new Thread(
                () -> {
                        for (int i = 0; i < 10_000; i++)
                            logs.log("Writing log with Thread 0");
                    });
        Thread t2 = new Thread(
                () -> {
                    for (int i = 0; i < 10_000; i++)
                        logs.log("Writing log with Thread 1");
                }
        );
        t1.start();
        t2.start();
        t1.join();
        t2.join();
        System.out.println(logs.count);
    }
}
