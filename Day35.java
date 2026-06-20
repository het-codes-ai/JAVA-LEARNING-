public class Main {
	
	public static int sum_array(int[]array){
		int sum=0;
		for (int i=0;i<array.length;i++){
			sum+=array[i];	
			}	
		System.out.println("Sum of all elements of array is "+ sum);
		return sum;
		}
	
	public static int prod_array(int[]array){
		int prod=1;
		for (int i=0;i<array.length;i++){
			prod*=array[i];	
			}	
		System.out.println("Product of all elements of array is "+ prod);
		return prod;
		}
	
	public static void main(String[] args) {
	int array1[]={2,4,5,6,6,7,2,9};	
	sum_array(array1);
	prod_array(array1);
	}
}