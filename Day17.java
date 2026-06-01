import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);		System.out.println("ENTER YOUR NUMBER  ");
	int n =sc.nextInt();
	
	
	for (int i=1;i<=n;i++){
		int num=i;
		
		for(int j=i;j>=1;j--){
			
			
			System.out.print(num);
			
			num--;
				
			}
		
		System.out.println();
	
		
		}
	}
}