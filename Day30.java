import java.util.*;
public class Main {
	
	public static int rev_num(int a){
		
		while(a>0){
			
			int rem=a%10;
			a/=10;
		
			System.out.print(rem);
				
			}
		
		return 0;
		}
	
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in );
	System.out.print("ENTER YOUR NUMBER  ");	
	int num=sc.nextInt();
	
	rev_num(num);
	}
	
}