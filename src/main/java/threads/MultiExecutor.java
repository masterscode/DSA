package threads;

import java.util.List;

public class MultiExecutor implements Runnable{

    private List<Runnable> tasks;

    public MultiExecutor(List<Runnable> t){
        tasks = t;
    }

    public void executeAll(){
        tasks.stream().map(Thread::new).forEach(Thread::start);
    }

    public static void main(String[] args) {
       MultiExecutor executor =  new MultiExecutor(List.of(
                new Runnable() {
                    @Override
                    public void run() {

                    }
                }
        ));



       executor.executeAll();
    }

    @Override
    public void run() {

    }
}
