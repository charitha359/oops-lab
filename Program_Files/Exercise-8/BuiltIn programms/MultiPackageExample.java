import java.util.*;               
import java.lang.Math;              
import java.util.concurrent.*;       
public class MultiPackageExample {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        System.out.println("Numbers List: " + numbers);
        double sqrtResult = Math.sqrt(16);
        double powResult = Math.pow(2, 3);
        System.out.println("Square root of 16: " + sqrtResult);
        System.out.println("2 raised to the power of 3: " + powResult);
        ExecutorService executor = Executors.newFixedThreadPool(2);
        Runnable task1 = () -> {
            System.out.println("Task 1 is running, calculating square of 5: " + Math.pow(5, 2));
        };
        Runnable task2 = () -> {
            System.out.println("Task 2 is running, calculating sum of 10 and 20: " + (10 + 20));
        };

        executor.submit(task1);
        executor.submit(task2);

        executor.shutdown();  
        executor.awaitTermination(1, TimeUnit.SECONDS);     }
}








