package exception_handling;

public class TestUncheckedException {

	public static void main(String[] args) {
		try {
			System.out.println("Parsed int " + Integer.parseInt("asdfg12345"));
			System.out.println("end of try...");
		} catch (NumberFormatException e) {
			System.out.println("1");
		}
		System.out.println("code continues...");

	}

}
