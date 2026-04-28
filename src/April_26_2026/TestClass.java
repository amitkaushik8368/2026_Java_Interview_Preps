package April_26_2026;

public class TestClass
{
    public static void main(String[] args)
    {
        AnotherClass anotherClass = new AnotherClass();
        anotherClass.start();
        //Thread t1 = new Thread(anotherClass);
        //t1.start();
    }
}
class AnotherClass extends Thread
{
    public void run()
    {
        System.out.println("Run Method Executing " + Thread.currentThread().getName());
    }
}
