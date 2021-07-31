package MultiThreading;

import java.util.Random;
import java.util.concurrent.*;

class Task implements Callable<String> {

    @Override
    public String call() {
        try {
            TimeUnit.SECONDS.sleep(5);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName());
        return Math.random() + " ";
    }
}

public class ExecutorServiceSample {

    public static void main(String[] args) throws InterruptedException {
        long startTime = System.currentTimeMillis();
        ExecutorService executors = Executors.newFixedThreadPool(3);
        Future<String> future1 = executors.submit(new Task());
        Future<String> future2 = executors.submit(new Task());

//        executors.shutdown();
//        while (!executors.awaitTermination(24L, TimeUnit.HOURS)) {
//            System.out.println("Not yet. Still waiting for termination");
//        }

        try {
            String str1= future1.get();
            String str2 = future2.get();
            System.out.println(str1 + " \n" + str2);
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        executors.shutdown();
        long stopTime = System.currentTimeMillis();
        long elapsedTime = stopTime - startTime;
        System.out.println("elapsedTime " + elapsedTime);
    }
}
