public class Main {
	public static void main(String[] args) {
		int nums[]={34,54,13,87,0,-12,45};
		
		int smallest=Integer.MAX_VALUE;
		int biggest=Integer.MIN_VALUE;
		
		for(int i=0;i<nums.length;i++){
			if (nums[i]<smallest){
				smallest=nums[i];
				}
			if (nums[i]>biggest){
				biggest=nums[i];
			
				}
			
			
			}
		System.out.println("SMALLEST VALUE IS "+smallest);
		System.out.println("LARGEST VALUE IS "+biggest);
	}
}