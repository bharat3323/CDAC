package threads9;

public class JointAccount {
	private int balance;

	public JointAccount(int balance) {
		super();
		this.balance = balance;
	}
	//update balance , opening bal=10,000 amount -5000
	public synchronized void updateBalance(int amount) throws InterruptedException{
		System.out.println("started updating the bal -"+Thread.currentThread().getName());
		balance = balance +amount;	//15,000	
		Thread.sleep(5);
		System.out.println("Cancelling the update here ....");
		balance = balance - amount;//10,000
		System.out.println("updating the bal  done-     "+Thread.currentThread().getName());
	}//10,000
	//check balance
	public synchronized int checkBalance() throws InterruptedException{
		Thread.sleep(7);//simulating real time delay to acces the balance
		System.out.println("checking balance "+Thread.currentThread().getName());
		return this.balance;
	}

}
