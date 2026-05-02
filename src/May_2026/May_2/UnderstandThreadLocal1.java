package May_2026.May_2;

class Transaction1{
    static ThreadLocal<String> transactionId = new ThreadLocal<>();
}

public class UnderstandThreadLocal1
{
    public static void main(String[] args) {
        Runnable task = ()->{
            String txnID = "TXN-" + Thread.currentThread().threadId();
            System.out.println(Thread.currentThread().getName() + " " + txnID);
            Transaction1.transactionId.set(txnID);
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " sees Transaction ID " + Transaction1.transactionId.get());
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

    }
}
