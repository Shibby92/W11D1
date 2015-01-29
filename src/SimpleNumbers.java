public class SimpleNumbers {

	public static void main(String[] args) {
		long startTime = System.currentTimeMillis();
		int counter = prime(0, 100000);
		long endTime = System.currentTimeMillis();

		System.out.println("Seconds: " + (double) (endTime - startTime) / 1000);
		System.out.println("Prime numbers: " + counter);
	}

	private static int prime(int start, int end) {
		int counter = 0;
		for (int i = start; i < end; i++) {

			int brojac = 0;
			for (int j = 1; j <= i; j++) {
				if (i % j == 0)
					brojac++;
			}
			if (brojac == 2) {
				counter++;
			}
		}
		return counter;

	}

}
