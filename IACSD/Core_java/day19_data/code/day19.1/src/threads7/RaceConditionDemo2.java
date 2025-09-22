package threads7;

public class RaceConditionDemo2 {
	private static int counter;

	public static void main(String[] args) throws InterruptedException {
		Runnable task = () -> {
			for (int i = 0; i < 1000; i++) {
				counter++;
			}
		};
		Thread t1 = new Thread(task);
		Thread t2 = new Thread(task);
		t1.join();
		t2.join();
		System.out.println("Counter - " + counter);
	}

}
