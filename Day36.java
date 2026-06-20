public class Main {
	public static int swap(int[] arr){
		int min=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++){
			if(arr[i]<min) {
				min=arr[i];
			
				}
			if(arr[i]>max){
				max=arr[i];
				

				}
			}
		System.out.println(max);
		System.out.println(min);
		
   	 int temp=min;
   	 min=max;
   	 max=temp;
		
		System.out.println(max);
		System.out.println(min);
		return 0;
		}	
	public static void main(String[] args) {
		int array1[]={2,45,7,3,5,0,-6,7};
		swap(array1);
		
	}
}