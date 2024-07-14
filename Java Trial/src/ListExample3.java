import java.util.LinkedList;
import java.util.List;

public class ListExample3 {

	public static void main(String[] args) {
	
		List<String> list=new LinkedList<String>();
		list.add("Ganesh");
		list.add("Adesh");
		list.add("Ram"); 
		list.add("Sachin");
		
		System.out.println(list);
		
		for(String str:list)
		{
			System.out.println(str);
		}
		
		
	}

}

