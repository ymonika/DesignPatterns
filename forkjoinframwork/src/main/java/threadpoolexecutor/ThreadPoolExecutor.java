package threadpoolexecutor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolExecutor {

    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        for (int i = 1; i < 11; i++) {
            Runnable thread = new WorkerThread("" + i);
            executorService.execute(thread);
        }
        executorService.shutdown();
        while (!executorService.isTerminated()) {
            ;
        }
        System.out.println("Finished all threads.");
    }
}
