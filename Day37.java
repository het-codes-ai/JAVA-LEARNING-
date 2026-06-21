public class Main {
	public static void main(String[] args) {
		int array1[] = {2, 2, 4, 6, 8, 4, 8, 9, 5, 8, 6, 3, 8};
		for (int i = 0; i < array1.length; i++) {
			int count = 0;
			for (int j = 0; j < array1.length; j++) {
				if (array1[i] == array1[j]) {
					count++;

				}
			}
			if (count == 1) {
				System.out.println(array1[i] + " is unique");

			} else {
				System.out.println(array1[i] + " is not unique");
			}
		}
	}
}