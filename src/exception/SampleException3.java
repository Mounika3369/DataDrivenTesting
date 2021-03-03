package exception;

public class SampleException3 {
	static void validate(int age) {
		if (age < 18) {
			throw new ArithmeticException("You are not eligibile for vote");
		} else {
			System.out.println("You are  eligibile for vote");
		}
	}

	public static void main(String[] args) {
		validate(14);

	}

}
