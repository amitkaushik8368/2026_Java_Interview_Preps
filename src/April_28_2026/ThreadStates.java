package April_28_2026;

public class ThreadStates extends Thread
{
    public static void main(String[] args) {
//        Thread t1 = new Thread(()-> System.out.println(Thread.currentThread().getState())
//        );
//
//        System.out.println(t1.getState());
//        t1.start();
//        System.out.println(t1.getState());

        Thread t = new Thread(() -> {
            System.out.println("Inside Thread Object: "+Thread.currentThread().getState());
        });

        System.out.println(t.getState()); // NEW
        t.start();
        System.out.println(t.getState()); // RUNNABLE
    }

    @Override
    public void run() {
        System.out.println("Running run method");
    }
}
