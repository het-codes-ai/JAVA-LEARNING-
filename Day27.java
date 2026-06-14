public class Main {
	public static int conv(int num){
		int power=1;
		int ans=0;	
		
		while (num>0){
			int rem=num%2;
			num/=2;
			
			ans=ans+(rem*power);
			power*=10;
			
			}
		System.out.println(ans);
		
		return 0;	
		}
	public static void main(String[] args) {
		for (int num=1;num<=100;num++){
			System.out.print(num+"  " );	
			conv(num);
			}
			
	}
}