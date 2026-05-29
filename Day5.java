import java.util.*;
public class Main {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter your first number  ");
	int a=sc.nextInt();
	
	System.out.println("Enter your second number  ");
	int b=sc.nextInt();
	
	if (a==b){
		System.out.println(a+" is equal to "+b);
		}
	if (a<b){
		System.out.println(a+" is lesa than "+b);
		}
	if(a>b){
		System.out.println(a+" is greater than "+b);
		}
	}
}