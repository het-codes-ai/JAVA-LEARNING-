import java.util.Arrays;
public class Main {
	public static int[] bubblesort(int[] arr) {
		int n = arr.length;
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}

			}
		}
		return arr;
	}
	public static void main(String[] args) {
		int[] array1 = {2, 5, 8, 9, 1};
		System.out.println(Arrays.toString(bubblesort(array1)));
	}
}