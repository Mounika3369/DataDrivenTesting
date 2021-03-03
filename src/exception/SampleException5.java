package exception;

public class SampleException5 extends Exception {
	public SampleException5(String str) {
		super(str);
	}

	public static void main(String[] args) throws SampleException5 {
		System.out.println("Enter the age");
		try {
			java.util.Scanner sc = new java.util.Scanner(System.in);
			int age = sc.nextInt();
			if (age < 18) {
				throw new SampleException5("Not eligible for vote");
			} else {
				System.out.println("Eligible for vote");
			}
		} catch (SampleException5 se) {
			se.printStackTrace();
		}

	}

}
