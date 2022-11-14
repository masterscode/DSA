package __V1.threads;

import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@NoArgsConstructor
public class MyRunnable implements Runnable{
    private int count = 0;
    @Override
    public void run() {
        
        for (int i = 0; i < 1_000_000; i++) {
            synchronized(this){
                this.count++;
            }
        }

        log.info(
            String.format("Thread name is %s : %d", Thread.currentThread().getName(), count)
        );
    }
    
    public static void main(String[] args) {
        Runnable myRunnable = new MyRunnable();
        Thread thread = new Thread(myRunnable, "First Runnable");
        Thread thread2 = new Thread(myRunnable, "Second Runnable");
        thread.start();
        thread2.start();
    }
}
