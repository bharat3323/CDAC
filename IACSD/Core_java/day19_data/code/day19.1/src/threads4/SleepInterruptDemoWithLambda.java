package threads4;

import static java.lang.Thread.*;

public class SleepInterruptDemoWithLambda {

	public static void main(String[] args) throws Exception{
		boolean exit = false;
		Runnable task1 = () -> {
				System.out.println(currentThread().getName() + " entering sleep");
				try {
					System.out.println(exit);
					Thread.sleep(10000);
					System.out.println(currentThread().getName() + " sleep over");
				} catch (InterruptedException e) {
					System.out.println(currentThread().getName() + " got err " + e);
				};
		};
		
		Thread t1=new Thread(task1, "one");
		t1.start();
	//	exit=true;
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
