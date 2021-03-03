package exception;

public class SampleException4 {
	static void display() throws ArithmeticException {
		int a = 1 / 0;
		System.out.println(a);
	}

	public static void main(String[] args) {
		try {
			display();
		} catch (ArithmeticException ae) {
			ae.printStackTrace();
		}
		System.out.println("Program is executed");

	}

}
