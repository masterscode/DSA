package __V1.threads;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TestThread extends Thread {

    @Override
    public void run() {
        log.info("Best approach to creating thread, thread-name is: ".concat(getName()));
    }

    public static void main(String[] args) {
        TestThread thread = new TestThread();
        thread.start();
    }

}
