import java.util.Vector;
import java.util.List;
public class Main {
	public static void main(String[] args) {
		Vector<String>fruits=new Vector<>(List.of("mango","apple","banana"));
		//add at index 2
		fruits.add(2,"watermelon");
		//front=get(0)
		System.out.println("First is "+fruits.get(0));
		//back=size-1
		System.out.println("Last is "+fruits.get(fruits.size()-1));
		//pop = remove
		fruits.remove(1);
		
		//size
		System.out.println(fruits.size());
		
		
		System.out.println(fruits);
	}
}