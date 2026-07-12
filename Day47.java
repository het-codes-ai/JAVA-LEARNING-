public class Main {
	public static void main(String[] args) {
		int[][] matrix = { {1, 2, 3, 7}, {4, 5, 5, 6}, {7, 99, 8, 9}, {4, 6, 9, 56} };
		int n = matrix.length;
		int sum = 0;

		for (int i = 0; i < n; i++) {
			sum += matrix[i][i];
			if (i != n - i - 1) {
				sum += matrix[i][n - i - 1];
			}
		}
		System.out.println(sum);
	}
}