public class Main {
	public static boolean isValid(int[] pages, int n, int m, int mid) {
		int students = 1;
		int pageSum = 0;
		for (int i = 0; i < n; i++) {
			if (pages[i] > mid) {
				return false;
			}
			if (pageSum + pages[i] <= mid) {
				pageSum += pages[i];
			} else {
				students++;
				if(students>m){return false;}
				else{pageSum=pages[i];} 
			}
		}
		return true;
	}
	public static int allocatebooks(int[] pages, int n, int m) {
		if (m > n) {
			return -1;
		}
		int sum = 0;
		for (int i = 0; i < n; i++) {
			sum += pages[i];
		}
		int ans=-1;
		int st = 0;
		int end = sum - 1;
		while (st <= end) {
			int mid = st + (end - st) / 2;
			
			if (isValid(pages, n, m, mid)) {
				ans = mid;
				end = mid - 1;
			} else {
				st = mid + 1;
			}
		}
		return ans;
	}
	public static void main(String[] args) {
		int[] pages = {2,6,8,5,9,9,7};
		int n = 7;
		int m = 5;
		System.out.println(allocatebooks(pages, n, m)) ;
	}
}