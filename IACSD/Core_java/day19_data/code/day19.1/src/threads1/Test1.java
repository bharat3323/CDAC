package threads1;

public class Test1 {

	public static void main(String[] args) throws InterruptedException {
		System.out.println(Thread.currentThread());//Thread[main,5,main]
		//create runnable task instance
		RunnableTask task=new RunnableTask();
		//create child threads & start the same
		Thread t1=new Thread(task,"one");
		Thread t2=new Thread(task,"two");
		Thread t3=new Thread(task,"three");
		Thread t4=new Thread(task,"four");
		//how many runnable threads ?1 - main
		t1.start();
		t2.start();
		t3.start();
		t4.start();//how many runnable threads ?5
		for(int i=0;i<10;i++)
		{
			System.out.println(Thread.currentThread().getName()+" exec counter # "+i);
			Thread.sleep(200);
		}
		
		System.out.println("main over...");

	}

}
