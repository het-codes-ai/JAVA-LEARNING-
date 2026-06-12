import java.util.*;
public class Main {
	public static int sum(int a, int b) {
		int sum = a + b;
		System.out.println("SUM IS " + sum);
		return sum;
	}
	public static int diff(int a, int b) {
		int diff = a - b;
		System.out.println("DIFF IS " + diff);
		return diff;
	}
	public static int multi(int a, int b) {
		int multi = a * b;
		System.out.println("PRODUCT IS " + multi);
		return multi;
	}
	public static double div(int a, int b) {
		double div = (double) a / b;
		System.out.println("QUOTION IS " + div);
		return div;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("ENTER FIRST NUMBER  ");
		int a = sc.nextInt();
		System.out.println("ENTER SECOND NUMBER  ");
		int b = sc.nextInt();
		sum(a, b);
		diff(a, b);
		multi(a, b);
		div(a, b);
	}
}