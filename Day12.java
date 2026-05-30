import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		System.out.println("ENTER YOUR NUMBER  ");
		 int n=sc.nextInt();
		
		for(int i=1;i<=n;i++){
			char ch='A';
			
			for(int j=1;j<=n;j++){
				System.out.print(ch+"  ");
				ch+=1;
				
				}
			System.out.println();
			}
	}
}