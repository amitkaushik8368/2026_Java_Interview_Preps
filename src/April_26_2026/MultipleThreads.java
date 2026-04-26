package April_26_2026;

public class MultipleThreads
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new ExecuteThreads());
        Thread t2 = new Thread(new ExecuteThreads());
        Thread t3 = new Thread(new ExecuteThreads());
        t1.start();
        t2.start();
        t3.start();

    }
}
class ExecuteThreads implements Runnable {

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Executing : " + Thread.currentThread().getName());
    }
}