package threads7;

public class RaceConditionDemo {
	private int counter;

	public static void main(String[] args) throws InterruptedException {
		RaceConditionDemo ref = 
				new RaceConditionDemo();
		ref.testMe();
	}
	private  void testMe() throws InterruptedException {
		System.out.println("in testMe , thread -"+Thread.currentThread().getName());//main
		Runnable task = () -> {
			System.out.println("Thread started - "+Thread.currentThread().getName());
			for (int i = 0; i < 1000000; i++) {
				synchronized (this) {
				  counter++;
				}
			}
			System.out.println("Thread over - "+Thread.currentThread().getName());
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.start();
		t2.start();
		t1.join();
		t2.join();
		System.out.println("Counter - " + counter);

	}

}
