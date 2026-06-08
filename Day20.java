public class Main {
	public static int sum(int a,int b){
		int s =a+b;
		
		System.out.println(s);	
		return s;
		}
	
	public static int min(int a , int b,int c){
		if( a<b  &&  a<c){
			System.out.println(a+"  is minimum");
			}
			
		if(b<a && b<c){
			System.out.println(b+" is minimum");	
			}
		
		if(c<a && c<b){
			System.out.println(c+" is minimum" );
			}
		return 0;
		}
	
	public static void main(String[] args) {
		sum(2,3);
		min(2,4,6);
		min(5,6,4);
		min(2,1,2);	
	}
}