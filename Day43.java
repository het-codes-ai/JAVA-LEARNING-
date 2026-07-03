import java.util.Arrays;

public class Main {

	public static int[] selectionSort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			int SI = i;
			for (int j = i + 1; j < n; j++) {
				if (arr[j] < arr[SI]) {
					SI = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[SI];
			arr[SI] = temp;
		}
		return arr;
	}


	public static void main(String[] args) {
		int[] array1 = {2, 4, 6, 1, 2, 4, 5, 7, 8, 07, 8, 1, 6};
		System.out.println(Arrays.toString(selectionSort(array1)));
	}
}