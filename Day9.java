import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Table of which number?  ");
		int n= sc.nextInt();
		int table=1;
		for (int i=1;i<=10;i++){
			table= n*i;
			System.out.println(table);
			}
		
	}
}