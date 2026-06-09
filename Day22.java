public class Main {
	public static int fact(int a){
		int fact =1;
		for(int n=1;n<=a;n++)
		{
			fact*=n;
		
			}	
		System.out.println(fact);
		return fact;
		
		}
	public static void main(String[] args) {
	
fact(5);
fact(7);
	}
}