package threads9;

public class UpdateBalanceTask implements Runnable {
	// state
	private JointAccount account;

	public UpdateBalanceTask(JointAccount account) {
		super();
		this.account = account;
	}

	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while(true)
			{
				account.updateBalance(5000);
				Thread.sleep(5);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() +" error "+e);
		}

		System.out.println(Thread.currentThread().getName() + " over");

	}

}
