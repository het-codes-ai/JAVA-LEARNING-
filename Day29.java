import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("ENTER YOUR NUMBER  ");
		int num = sc.nextInt();

		if (num > 0 && (num & (num - 1))== 0) {
			System.out.println("NUMBER IS SOME POWER OF 2 ");}

		else {
			System.out.println("NUMBER IS NOT ANY POWER OF 2");
			}
		}
	}
