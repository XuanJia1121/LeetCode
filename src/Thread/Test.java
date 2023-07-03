package Thread;

import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;

public class Test {
	
	public static void main(String args[]) throws Exception, ExecutionException {
		Callable1 callable1 = new Callable1("Message1", 4000L);
		Callable1 callable2 = new Callable1("Message2", 8000L);

		FutureTask<String> futureTask1 = new FutureTask<String>(callable1);
		FutureTask<String> futureTask2 = new FutureTask<String>(callable2);

		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.execute(futureTask1);
		executor.execute(futureTask2);

		System.out.println(futureTask1.get());
		System.out.println(futureTask2.get());
	}

}
