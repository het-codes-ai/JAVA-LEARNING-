import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Sum of how many natural number starting from 1?   ");
		int n = sc.nextInt();
		
		int sum =0;
		for(int i=1;i<=n;i++)
		{
			sum += i ;
			
			}
		System.out.println(sum);
 	}
}