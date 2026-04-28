package April_26_2026;

public class MultipleThreads
{
    public static void main(String[] args)
    {
        Thread t1 = new Thread(new ExecuteThreads());
        Thread t2 = new Thread(new ExecuteThreads());
        Thread t3 = new Thread(new ExecuteThreads());
        System.out.println(t1.getState());
        System.out.println(t2.getState());
        System.out.println(t3.getState());
        t1.start();
        System.out.println("Line 14 " + t1.getState());
        t2.start();
        System.out.println("Line 16 " + t2.getState());
        t3.start();
        System.out.println("Line 18 " + t3.getState());

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