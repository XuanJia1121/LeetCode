package Thread;

import java.util.concurrent.Callable;

public class Callable1 implements Callable<String> {
	
	private String message;
	private long sleepTimeMillis;

	public Callable1(String message, long sleepTimeMillis) {
		this.message = message;
		this.sleepTimeMillis = sleepTimeMillis;
	}

	@Override
	public String call() throws Exception {
		Thread.sleep(sleepTimeMillis);
		return this.message;
	}
	
}
