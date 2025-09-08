package exception_handling;

public class Test1 {

	public static void main(String[] args) {
		try {
			int[] data = { 1, 2, 3, 4, 5, 6 };
			System.out.println(data[data.length - 1]);
			System.out.println("parsed int " + Integer.parseInt("12345"));
			String s = "abcd";
			System.out.println("begin char " + s.charAt(0));
			int a = 100;
			int b = 0;
			System.out.println("int div " + (a / b));
			System.out.println("end of try");
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("1");
		} catch (NumberFormatException e) {
			System.out.println("2");
		} catch (Exception e) {
			System.out.println("in catch all");
			System.out.println(e.getMessage());
			System.out.println("---------------------");
			System.out.println(e);
			System.out.println("----------------");
			e.printStackTrace();
		}
		System.out.println("code continues....");

	}

}
