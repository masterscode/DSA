package __V1.threads;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class ThreadPool {
    private BlockingQueue<Runnable> taskQueue = null;
    private List<PoolThreadRunnable> runnables = new ArrayList<>();
    private boolean isStopped = false;

    public ThreadPool(int threadCount, int maxTask) {
        taskQueue = new ArrayBlockingQueue<>(maxTask);

        for (int i = 0; i < threadCount; i++) {
            PoolThreadRunnable runnable = new PoolThreadRunnable(taskQueue);
            runnables.add(runnable);
        }

        for (PoolThreadRunnable poolThreadRunnable : runnables) {
            Thread thread = new Thread(poolThreadRunnable);
            thread.start();
        }
    }

    public synchronized void execute(Runnable task) {
        if (this.isStopped)
            throw new IllegalStateException("ThreadPool is stopped");

        taskQueue.offer(task);
    }

    public synchronized void stop() {
        isStopped = true;

        for (PoolThreadRunnable poolThreadRunnable : runnables)
            poolThreadRunnable.doStop();
    }

    public synchronized void waitUntilAllTaskFinished() {
        while (taskQueue.size() > BigInteger.ZERO.intValue()) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        ThreadPool threadPool = new ThreadPool(2, 5);

    }
}
