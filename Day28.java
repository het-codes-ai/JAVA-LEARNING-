public class Main {
	
public static int conv(int num){
	int power=0;
	int ans=0;
	while(num>0){
		int rem=num%10;
		num/=10;
		ans+=rem*Math.pow(2,power) ;
		power+=1;
		
		
		
		}
	
	System.out.println(ans);
	return ans;
	}	

	public static void main(String[] args) {
	conv(110010);	
	}
}