
public class Main {
	public static int fact(int a){
		int multi=1;
		for(int i=1;i<=a;i++){
			multi*=i;
			}
		return multi;
		} 
	
	
	public static void main(String[] args) {
		
		
		
		int n=8;int r=3;
		fact(n);
		fact(r);
		fact(n-r);
		
		int BC=fact(n)/(fact(r)*fact(n-r));
		System.out.println(BC);
		
	}
}