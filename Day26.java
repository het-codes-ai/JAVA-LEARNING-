import java.util.*;
public class Main {
	public static int primecheck(int num){
		for (int i=2;i<num;i++){
			if (num%i==0){
				System.out.println("NUMBER IS NOT PRIME ");
				break;
				}	
				
			else{
				System.out.println("NUMBER IS PRIME ");
				break;
				}	
			}	
		return 0;	
		}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.print("ENTER YOUR NUMBER  ");
		int num=sc.nextInt();

		
		primecheck(num);
	}
}