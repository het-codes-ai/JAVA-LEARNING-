public class Main {
	public static int[] pairsum(int[] array, int target) {
		int i = 0;
		int j = array.length - 1;
		while (i < j) {
			int sum = array[i] + array[j];
			if (sum < target) {
				i++;
			} else if (sum > target) {
				j--;
			} else if (sum == target){
				
				System.out.println("["+i+" , "+j+"]");
				return new int[]{i,j};
			}
		}
		return new int[]{-1,-1} ;
	}
	public static void main(String[] args) {
		int a1[] = {2, 4, 7, 8};
		int t1 = 5;
		pairsum(a1, t1);
		
	}
}