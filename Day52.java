public class Main {
	public static boolean isSorted(int[] arr,int n){
		if(n==0 || n==1){
			return true;
			}
		return arr[n-1]>=arr[n-2] && isSorted(arr,n-1);
		
		
		}
	public static void main(String[] args) {
		int [] arr1={1,3,3,4,5};
		int size=arr1.length;
		System.out.print(isSorted(arr1,size));
	}
}