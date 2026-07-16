import java.util.List;
import java.util.ArrayList;

public class Main {
	public static void ps(int[] arr,List<Integer> ans,int i){
		if(i==arr.length){ 			
			System.out.println(ans);
			return; 										
		}
		//going ahead
		ans.add(arr[i]);
		ps(arr,ans,i+1);
		
		//backtracking
		ans.remove(ans.size()-1);
		ps(arr,ans,i+1);	
		}
	public static void main(String[] args) {
		int arr[]={1,2,3,4,5};
		List <Integer> ans=new ArrayList <>();
		
		System.out.println("All subsets :  ");
		ps(arr,ans,0);
	} 
}