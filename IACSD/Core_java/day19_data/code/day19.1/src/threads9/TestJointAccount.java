package threads9;

public class TestJointAccount {

	public static void main(String[] args) throws InterruptedException{
		// 1. create  SINGLE joit account instance
		JointAccount ourAccount=new JointAccount(10000);
		//2. Create tasks , attach threads & start them
		Thread t1=new Thread(new UpdateBalanceTask(ourAccount), "c1");// customer 1
		Thread t2=new Thread(new CheckBalanceTask(ourAccount), "c2");//customer 2
		t1.start();
		t2.start();
		System.out.println("main waiting.....");
		t1.join();
		t2.join();
		System.out.println("main over ......");

	}

}
