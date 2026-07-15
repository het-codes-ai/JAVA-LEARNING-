public class Main {
	public static int BS(int[] arr,int target,int st,int end){
		if(st<=end){
			int mid=st+(end-st)/2;
			if(arr[mid]==target){
			return mid;			
			}
			else if(target < arr[mid]){
				return BS(arr,target,st,mid-1) ;
				}
			else{
				return BS(arr,target,mid+1,end);
				}									
		}
		return-1;
	}
	public static void main(String[] args) {
		int[] arr1={1,2,3,4,5,6,7,8};
		int target=6;
		int st=0;
		int end=arr1.length-1;
		System.out.println(BS(arr1,target,st,end));
	}
}