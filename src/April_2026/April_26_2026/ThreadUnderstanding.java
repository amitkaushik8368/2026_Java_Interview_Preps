package April_2026.April_26_2026;

public class ThreadUnderstanding extends Thread
{
    public static void main(String[] args) {
        ThreadUnderstanding threadUnderstanding = new ThreadUnderstanding();
        ThreadUnderstanding threadUnderstanding1 = new ThreadUnderstanding();
        threadUnderstanding.start();
        System.out.println(Thread.currentThread().getName());
        threadUnderstanding1.start();

    }

    public void run()
    {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("New Thread has started " + Thread.currentThread().getName());
    }

}
