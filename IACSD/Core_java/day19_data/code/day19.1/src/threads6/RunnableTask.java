package threads6;

public class RunnableTask implements Runnable {

	@Override
	public void run() {
		System.out.println(Thread.currentThread() + " started");
		try {
			for (int i = 0; i < 10; i++) {
				System.out.println(Thread.currentThread().getName() + " exec counter # " + i);
				if (Thread.currentThread().getName().equals("two")) {
					System.out.println("Enter data ");
					System.out.println("You entered - " + System.in.read());//causes blocking of t2 : on i/p
				}
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("Exception in Thread " + Thread.currentThread().getName() + " error " + e);
		}
		System.out.println(Thread.currentThread() + " over");
	}
}
