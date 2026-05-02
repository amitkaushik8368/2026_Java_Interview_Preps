package May_2026.May_2;

class Transaction{
    static String transactionId;
}

public class UnderstandThreadLocal
{
    public static void main(String[] args) {
        Runnable task = ()->{
            String txnID = "TXN-" + Thread.currentThread().threadId();
            System.out.println(Thread.currentThread().getName() + " " + txnID);
            Transaction.transactionId = txnID;
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

            System.out.println(Thread.currentThread().getName() + " sees Transaction ID " + Transaction.transactionId);
        };

        for (int i = 0; i < 5; i++) {
            new Thread(task).start();
        }

    }
}
