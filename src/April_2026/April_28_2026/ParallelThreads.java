package April_2026.April_28_2026;

public class ParallelThreads
{
    public static void main(String[] args)
    {
        Thread t = new Thread(
                () ->
                {
                    for (int i = 0; i < 5; i++) {
                        System.out.println("Implementing run method through Lambda in for loop : " + i);
                    }
                }
        );
        t.start();
        for (int i = 0; i < 5; i++) {
            System.out.println("Main Thread: " + i);
        }


    }
}
