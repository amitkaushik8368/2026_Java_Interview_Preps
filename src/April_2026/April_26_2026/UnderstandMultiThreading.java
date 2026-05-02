package April_2026.April_26_2026;

public class UnderstandMultiThreading
{
    public static void main(String[] args) {

        //ExecutorService

        MyThread myThread = new MyThread();
        myThread.start();
    }
}
class MyThread extends Thread
{
    public void run()
    {
        System.out.println("Thread is running");
    }
}