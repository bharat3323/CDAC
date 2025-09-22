package threads9;

public class CheckBalanceTask implements Runnable {
	// state
	private JointAccount account;
	public CheckBalanceTask(JointAccount account) {
		super();
		this.account = account;
	}
	@Override
	public void run() {
		System.out.println(Thread.currentThread().getName() + " strted");
		try {
			while (true) {
				int balance = account.checkBalance();
				if (balance != 10000) {
					System.out.println("ERROR!!!!!!!!!!!!!!");
					System.exit(-1);
				}
				Thread.sleep(5);
			}
		} catch (Exception e) {
			System.out.println(Thread.currentThread().getName() + " error " + e);
		}

		System.out.println(Thread.currentThread().getName() + " over");

	}

}
