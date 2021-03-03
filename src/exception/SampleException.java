package exception;

public class SampleException {
	public static void main(String[] args) {
		System.out.println("The  topic is exceptions");
		try {
			int a = 3;
			int b = 0;
			int c = a / b;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
			System.out.println(ae.toString());
			System.out.println(ae.getMessage());
			System.out.println("The number is not divisable by zero");
		} finally {
			System.out.println("The program is successfully completed");
		}
		System.out.println("My name is mounika");
		System.out.println("I am from atp");
	}
}
