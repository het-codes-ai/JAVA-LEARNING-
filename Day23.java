import java.util.*;
public class Main {
	public static int sum(int n){
		int sum=0;
		while (n>0){
			int digit=n%10;
			sum+=digit;
			n/=10;
			
			}
		System.out.println(sum);
		return 0;
		}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);		System.out.print("ENTER YOUR NUMBER  ");
	int n=sc.nextInt();
	sum(n);
	}
}