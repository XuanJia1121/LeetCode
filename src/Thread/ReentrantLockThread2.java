package Thread;

import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;

public class ReentrantLockThread2 implements Runnable {

	private Lock lock;
	private Condition condition;

	public ReentrantLockThread2(Lock lock, Condition condition) {
		this.lock = lock;
		this.condition = condition;
	}

	@Override
	public void run() {
		try {
			this.lock.lock();
			System.out.println("RUN THREAD 2");
			this.condition.signal();
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			System.out.println("2 unlock");
			this.lock.unlock();
		}
	}

}
