import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Future {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        Callable<String> callable = new MyCallable();
        FutureTask futureTask = new FutureTask(callable);
        new Thread(futureTask).start();
        System.out.println(futureTask.get());

    }

    public static class MyCallable implements Callable {

        @Override
        public Object call() throws Exception {

            Thread.sleep(50000);
            return "Working on";
        }
    }
}
