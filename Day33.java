public class Main {
	public static void main(String[] args) {
		int array1[]={2,4,6,7,3,5,3,2,1,9,7};
		
		int target =8;
		boolean found=false;
		for (int i=0;i<array1.length;i++){
			if(array1[i]==target){
				System.out.println("Target found at index "+ i);
				found=true;
				break;
				}				
			if(! found)
			
			{
				System.out.print("not found");
				break;
				}		
			}
		
		}
}