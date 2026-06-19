public class Main {
	public static void main(String[] args) {
		int nums[] = {34, 54, 13, 87, 0, -12, 45};

		int smallest_index = 0;
		int biggest_index = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] < nums[smallest_index]) {
				smallest_index = i;


			}

			if (nums[i] > nums[biggest_index]) {
				biggest_index = i;

			}


		}
		System.out.println("SMALLEST VALUE IS " + smallest_index);
		System.out.println("LARGEST VALUE IS " + biggest_index);
	}
}