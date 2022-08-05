package threads;

import java.math.BigInteger;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.Semaphore;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class StopThread {

    public static void main(String[] args) {
        List<Long> inputNumbers = Arrays.asList(1000000L, 3435L, 2324L, 4656L, 23L, 5556L);
        List<FactorialThread> factorialThreads = inputNumbers.stream().map(FactorialThread::new).toList();
        factorialThreads.forEach(thread->{
            thread.setDaemon(true);
            thread.start();
            try {
                thread.join(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        
        factorialThreads.forEach(thread->{
            if(thread.isFinished())
                log.info(String.format("Factorial of %d is %d", thread.getInputNumber(), thread.getResult()));
            else log.info(String.format("calculation for %d is still in progress", thread.getInputNumber()));
        });
    }

    private static class LongComputationTask implements Runnable {
        private BigInteger base;
        private BigInteger power;

        public LongComputationTask(BigInteger base, BigInteger power) {
            this.base = base;
            this.power = power;
        }

        private BigInteger pow(BigInteger base, BigInteger power) {
            BigInteger result = BigInteger.ONE;

            for (BigInteger i = BigInteger.ZERO; i.compareTo(power) != 0; i = i.add(BigInteger.ONE)) {
                if (Thread.currentThread().isInterrupted()) {
                    log.info("Thread is prematurely interrupted");
                    return BigInteger.ZERO;
                }
                result = result.multiply(base);
            }

            return result;
        }

        @Override
        public void run() {
            log.info(String.format("%d ^ %d = %d", base, power, pow(base, power)));
        }

    }

    @Data
    private static class FactorialThread extends Thread {
        private long inputNumber;
        private BigInteger result = BigInteger.ZERO;
        private boolean isFinished = false;

        public FactorialThread(long n) {
            inputNumber = n;
        }

        public BigInteger factorial(long n) {
            BigInteger temp = BigInteger.ONE;

            for (long i = n; i > 0; i--) {
                temp = temp.multiply(new BigInteger(Long.toString(i)));
            }

            BigInteger finalTemp = temp;
            CompletableFuture.runAsync(()-> log.info("", finalTemp));
            Semaphore semaphore = new Semaphore(MIN_PRIORITY);
            return temp;
        }

        @Override
        public void run() {
            this.result = factorial(inputNumber);
            isFinished = true;
        }

    }
}
