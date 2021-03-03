package exception;

public class SampleException1 {

	public static void main(String[] args) {
		try {
			int[] arr = { 1, 2, 3 };
			try {
				arr[5] = 10 / 0;

			} catch (ArithmeticException ae) {
				ae.printStackTrace();
			}
			arr[4] = 6;
		} catch (ArrayIndexOutOfBoundsException aioob) {
			aioob.printStackTrace();
		}
	}

}
