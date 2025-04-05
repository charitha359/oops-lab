public class InterruptedExceptionExample {
    public static void main(String[] args) {
        try {
            Thread.sleep(1000);
            System.out.println("Execution Resumed!");
        } catch (InterruptedException e) {
            System.out.println("Thread Interrupted!");
        }
    }
}
