package threads;

import java.util.concurrent.BlockingQueue;

import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class PoolThreadRunnable implements Runnable {
    private Thread thread;
    private BlockingQueue<Runnable> taskQueue = null;

    @Getter
    private boolean isStopped = false;

    public PoolThreadRunnable(BlockingQueue<Runnable> qRunnables) {
        taskQueue = qRunnables;
    }

    @Override
    public void run() {
        thread = Thread.currentThread();
        while (Boolean.FALSE.equals(isStopped())) {
            try {
                Runnable runnable = taskQueue.take();
                runnable.run();
            } catch (Exception e) {
                // ...
                log.error("PoolThreadRunnable exception {}", e);
            }
        }
    }

    public synchronized void doStop() {
        isStopped = true;

        thread.interrupt();
    }

}
