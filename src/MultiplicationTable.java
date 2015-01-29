public class MultiplicationTable {

	public static void main(String[] args) {
		for (int i = 1; i <= 10; i++) {
			for (int j = 1; j <= 10; j++) {
				System.out.printf("%4d", i * j);
			}
			System.out.println();

		}
		int[][] niz = new int[3][3];
		int[][] niz2 = new int[3][3];
		int num = 1;
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				niz[i][j] = num;
				niz2[i][j] = num;
				num++;
			}
		}
		int[][] sumaNizova = sum(niz, niz2);

	}

	private static int[][] sum(int[][] niz, int[][] niz2) {
		int[][] noviNiz = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				noviNiz[i][j] = niz[i][j] + niz2[i][j];
				System.out.printf("%4d", noviNiz[i][j]);
			}
			System.out.println();
		}
		return noviNiz;
	}
}
