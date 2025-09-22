package threads2;

public class RunnableTask implements Runnable {
	
	@Override
	public void run() {
		System.out.println(Thread.currentThread()+" started");
		try {
			for(int i=0;i<10;i++)
			{
				System.out.println(Thread.currentThread().getName()+" exec counter # "+i);
				Thread.sleep(100);
			}
		} catch (Exception e) {
			System.out.println("Exception in Thread "+Thread.currentThread().getName()+" error "+e);
		}
		System.out.println(Thread.currentThread()+" over");
	}
}
