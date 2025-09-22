package threads4;

import static java.lang.Thread.*;

public class SleepInterruptDemo {

	public static void main(String[] args) throws Exception{
		boolean exit = true;
		Runnable task1 = new Runnable() {
			@Override
			public void run() {
				System.out.println(currentThread().getName() + " entering sleep");
				try {
					Thread.sleep(10000);
					System.out.println(currentThread().getName() + " sleep over");
				} catch (InterruptedException e) {
					System.out.println(currentThread().getName() + " got err " + e);
				}
				System.out.println(currentThread().getName() + " thread over");


			}
		};
		Thread t1=new Thread(task1, "one");
		t1.start();
		Thread.sleep(1000);
		if(exit)
		{
			System.out.println("main interrupting - t1");
			t1.interrupt();
		}
		t1.join();
		System.out.println("main over....");

	}

}
